### item - 3

#### Prviate 생성자나 열거 타입으로 싱글턴임을 보증해라 

#### 방식

1. public static final 필드 방식
   - 해당 클래스가 싱글턴임이 API에 명백히 드러냄
   - public static 필드가 final이니 절대로 다른 객체를 참조할 수 없습니다.
   - 간결함
2. 정적 팩터리 방식
   - API를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다.
   - 제네릭 싱글턴 팩터리로 바꿀 수 있다.
   - 정적 팩터리의 메서드 참조를 공급자로 사용할 수 있다.
3. 열거 타입의 방식
   - public 필드 방식과 비슷하지만, 더 간결하고, 추가 노력 없이 직렬화할 수 있다.
   - 심지어 아주 복잡한 직렬화 상황이나 리플렉션 공격에서도 제2의 인스턴스가 생기는 일을 완벽히 막아준다.
   - 대부분의 상황에서는 원소가 하나뿐인 열거 타입의 싱글턴을 만드는 것이 좋다.