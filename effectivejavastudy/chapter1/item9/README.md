## item-9 : try-finally 대신 try-with-resource 사용

### try-with-resource 방식 이점

- try-finally 방식은 자원이 여러개인 경우, 코드가 지저분
- 자원을 닫지 않은 실수 방지 
- 문제 진단이 try-finally 보다 수월
  - try-finally는 readLine, close에 대한 예외 발생시, readLine에 대한 예외는 삼켜버림
  - 반면 try-with-resource는 readLine에 대한 예외도 기록되고, close에 대한 예외도 Suppressed(숨겨짐) 꼬리표를 달고 출력
