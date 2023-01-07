# 회원 관리 - 백엔드 개발 _ study

:book: 회원 관리 - 백엔드 개발 <br/>

:one: 비즈니스 요구사항 정리 <br/>
:two: 회원 도메인과 리포지토리 만들기 <br/>
:three: 회원 리포지토리 테스트 케이스 작성 <br/>
:four: 회원 서비스 개발 <br/>
:five: 회원 서비스 테스트 <br/>


✏️ 비즈니스 요구사항 정리  <br/>
:round_pushpin: 데이터: 회원ID, 이름 <br/>
:round_pushpin: 기능: 회원 등록, 조회 <br/>
:round_pushpin: 아직 데이터 저장소가 선정되지 않음(가상의 시나리오) <br/>

✏️ 일반적인 웹 애플리케이션 계층 구조 <br/>
![image](https://user-images.githubusercontent.com/102573192/211017919-27707627-1420-4638-9be1-a4e4340d0df6.png) <br/>

:round_pushpin: 컨트롤러: 웹 MVC의 컨트롤러 역할 <br/>
:round_pushpin: 서비스: 핵심 비즈니스 로직 구현 <br/>
:round_pushpin: 리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리 <br/>
:round_pushpin: 도메인: 비즈니스 도메인 객체, 예) 회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨 <br/>

✏️ 클래스 의존관계 <br/>
![image](https://user-images.githubusercontent.com/102573192/211017957-0752be48-323e-46ca-9dc7-a8425ee8f1dc.png) <br/>

:round_pushpin: 아직 데이터 저장소가 선정되지 않아서, 우선 인터페이스로 구현 클래스를 변경할 수 있도록 설계 <br/>
:round_pushpin: 데이터 저장소는 RDB, NoSQL 등등 다양한 저장소를 고민중인 상황으로 가정 <br/>
:round_pushpin: 개발을 진행하기 위해서 초기 개발 단계에서는 구현체로 가벼운 메모리 기반의 데이터 저장소 사용 <br/>

✏️ <결과>  <br/>
DB - H2  <br/>

![image](https://user-images.githubusercontent.com/102573192/211134316-b7e7ffad-d017-494f-9e5f-9d98852aca42.png)  <br/>

