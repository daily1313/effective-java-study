### item - 5

#### 자원을 직접 명시하지 말고 의존 객체 주입을 활용하라 


#### 잘못된 예시
1. 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
```aidl
public class SpellChecker {
    private static final Lexicon dictionary = ...;
    
    private SpellChecker() {} // 객체 생성 방지
    
    public static boolean isValid(String word) {...}
    public static List<String> suggestions(String type) {...}
}
 ```
2. 싱글톤을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
```aidl
public class SpellChecker {
    private static final Lexicon dictionary = ...;
    
    private SpellChecker() {} // 객체 생성 방지
    private static SpellChecker INSTANCE = new SpellChecker(...);
    
    public static boolean isValid(String word) {...}
    public static List<String> suggestions(String type) {...}
}
 ```
#### 올바른 방향
의존 객체 주입 
- 인스턴스를 생성할 때 생성자에 필요한 자원을 넘겨줌
- 의존 객체 주입은 유연성과 테스트 용이성을 높여줌
- dictionary 자원 하나만 사용하지만, 자원이 몇개든 의존관계가 어떻게 되든 잘 작동
- 불변을 보장하여 여러 클라이언트가 의존 객체들을 안심하고 공유할 수 있다.
- 생성자, 정적 팩터리, 빌더에 똑같이 응용이 가능
```
public class SpellChecker {
    private final Lexicon dictionary;
    
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requiredNonNull(dictionary);
    }
    
    public boolean isValid(String word) {...}
    public List<String> suggestions(String typo) {...}
```