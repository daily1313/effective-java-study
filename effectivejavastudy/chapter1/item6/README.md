### item - 6

#### 불필요한 객체 생성을 피하라

1. 생성자 대신 팩토리 메서드 고려 (재사용성 고려)
   - String s = new String("bikini"); (x)
   - String s = "bikini"
2. 생성 비용이 비싼 객체가 반복해서 사용된다면, 캐싱해서 재사용하는 것을 권장
   - 시스템의 자원을 많이 먹는 부분 (메모리, 디스크 사용량, 네트워크 대역폭)
   - 데이터의 크기가 크거나 객체 내부에 여러 객체들을 포함하는 경우 (DB Connection, I/O 작업을 수행하는 Object)
   - Expression Object Pattern
    ```aidl
    
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
    (x)
    
    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    
    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }
    (o)
    ```

3. 불변 객체를 재사용할 때 위험한 부분
   - Map 인터페이스가 제공하는 keySet은 Map이 뒤에 있는 Set 인터페이스의 뷰를 제공
   - keySet()을 호출할 때 같은 객체를 리턴
    ```aidl
    Map<String, Integer> menu = new HashMap<>();
    menu.put("A", 1);
    menu.put("B", 2);
    
    Set<String> names1 = menu.keySet();
    Set<String> names2 = menu.keySet();
    
    // set 객체를 지웠지만, map에 영향을 줌 
    
    names1.remove("A");
    System.out.println(names2.size()); // 1
    System.out.println(menu.size()); // 1
    ```
4. 불필요한 객체를 만들어내는 예: 오토박싱/언박싱
   - sum 변수를 Long으로 선언해서 불필요한 Long 인스턴스가 2^31개 생성
   - 단순히 타입을 long으로 바꿔주면 속도가 6.3s -> 0.59s로 개선
    ```
    long start = System.currentTimeMillis();
    Long sum = 0l;
    for (long i = 0 ; i <= Integer.MAX_VALUE ; i++) {
        sum += i;
    }
    System.out.println(sum);
    System.out.println(System.currentTimeMillis() - start);
    ```
   
5. 단순히 객체 생성을 피하고자 pool을 만들면 안됨 
   - DB connection의 경우는 제외
   - 일반적인 경우에서는 객체 풀은 코드를 헷갈리게 하고 메모리 사용량을 늘리고 성능 저하의 원인이 됨
   - 가벼운 객체를 다룰 때는 JVM GC > Pool (성능) 
