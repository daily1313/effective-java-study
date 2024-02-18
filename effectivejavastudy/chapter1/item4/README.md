### item - 4

#### 인스턴스화를 막으려거든  private 생성자를 사용하라


#### ex
1. java.lang.Math, java.util.Arrays, java.util.Collections
2. 정적 멤버만 담은 유틸리티 클래스는 인스턴스로 만들어 쓰려고 설계한기 아니기에, private 생성자 사용
3. 추상 클래스로 만드는 것으로는 인스턴스화를 막을 수 없습니다. 
4. private 생성자 + 생성자 안에 AssertionError() 던져주면 클래스 안에서 실수로라도 생성자를 호출하지 않도록 해줌