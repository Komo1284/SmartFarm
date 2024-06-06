# 🌿 SmartFarm Project
***
![title](http://3.36.207.45:8080/img/mainImg.jpg)
***

# 📑 목차
***
* #### [개요](#-개요)
* #### [프로젝트 소개](#-프로젝트-소개)
* #### [개발 기간](#-개발-기간)
* #### [멤버 구성 및 담당 항목](#-멤버-구성-및-담당-항목)
* #### [개발 환경](#-개발-환경)
* #### [배포 주소](#-배포-주소)
* #### [유스케이스 다이어그램](#-유스케이스-다이어그램)
* #### [아키텍쳐](#-아키텍쳐)


# 📒 개요
***
* #### `[스마트혼합](디지털컨버전스)` 전자정부기반 e커머스 융합 SW 개발자 양성 과정 중 팀 프로젝트를 진행하며 제작한 Web-Page 코드입니다.
* #### Spring Boot를 활용하여 원격으로 농작 환경을 모니터링할 수 있는 Module 제품을 판매하고, 사용자들이 생산한 작물을 직거래 할 수 있는 환경을 구축했습니다.


# 💻 프로젝트 소개
***
### 농작 환경을 관리할 수 있는 IOT 제품 개발
<details><summary> 세부 사항 </summary>

* 아두이노 보드를 기반으로 기초적인 IOT 기술을 접목하여 원격으로 농작 환경을 모니터링(온도, 습도, CCTV)할 수 있는 환경을 구축.


* 구매자에 한해 해당 항목들을 Web-Page 및 스마트폰 어플리케이션을 통해 확인할 수 있도록 연동 기능 지원.

</details>

### 모니터링 모듈 제품 판매 환경 구축
<details><summary> 세부 사항 </summary>

* SmartFarm Managing Module 제품을 구매할 수 있는 Web-Page 환경 구축.


* 제품을 구매한 이용자에 한정해 스마트폰 어플리케이션 다운로드 서비스 제공.


* 외부 API(KG이니시스)를 활용해 신용 카드 결제, 실시간 계좌 이체, 가상 계좌, 휴대폰 소액 결제 등의 다양한 결제 방식 지원.

</details>

### 홈페이지 이용자를 위한 커뮤니티 및 거래 환경 조성
<details><summary> 세부 사항 </summary>

* 농산, 원예 분야의 이용자들이 자유롭게 정보 및 의견을 교환할 수 있는 CRUD 기능 기반의 자유 게시판 환경 구축.


* 각 게시글의 ID에 종속되는 댓글 작성, 삭제 기능 구현.


* 직접 생산한 농산품을 카테고리 별로 분류해 사용자끼리 직접 거래할 수 있는 장터 게시판 환경 구축.


* 장터를 이용하는 구매자와 판매자 간에 원활한 소통을 보조하기 위한 Web-Socket 활용 1:1 비동기 Chat 기능 지원.

</details>

### 이용자의 편의성과 프라이버시 보호에 최적화된 QnA 시스템
<details><summary> 세부 사항 </summary>

* 제품 및 Web-Page 이용자의 문의사항에 관리자의 검증된 답변을 제공할 수 있는 게시판 환경 구축.


* 이용자의 정보 보호를 위한 비밀글 기능 지원.

</details>


### 가입자의 개인 정보를 일괄적으로 확인 및 관리할 수 있는 맞춤형 페이지
<details><summary> 세부 사항 </summary>

* 로그인한 세션의 정보와 DB상의 데이터를 비교해 개인 맞춤형으로 제공되는 정보 관리 페이지 환경.


* 비밀번호 초기화 시 랜덤한 난수형 임시 비밀번호 생성 및 발급으로 보안 강화.


* 사용자의 정보 보안을 위한 비밀번호 암호화 해싱 알고리즘(SHA-512) 적용.


* 거래 상대와 진행 중인 1:1 Chat Channel 일괄 조회 기능 제공.


* 구매한 상품의 실시간 주문 현황 확인 가능.

 </details>


### 상징적이고 효용적인 Web-Page Design
<details><summary> 세부 사항 </summary>

* 시각적 피로도를 최소화하기 위해 낮은 채도를 적용한 녹색 위주의 Design 구성.


* Web-Page의 목적성을 시각화한 다양한 형태의 자료 활용.

  </details>


# 📆 개발 기간
***
### 2024.05.16 ~ 2024.05.30


# 👥 멤버 구성 및 담당 항목
***
* #### 곽동열 : 자유 게시판, QnA 게시판 (CRUD, Paging, Search), Reply 시스템 구축
* #### 김정은 : 결제 API 환경 구축, 주문 상태 관리 환경 구축
* #### 김태환 : 주문 시스템 구축, 제품 상세 페이지 및 주문 페이지 전반 환경 구축
* #### 서강혁 : DataBase Script 제작, 통합 및 형상 관리, CSS, Server, Web-Socket 기반 Chat System, Member 관리 시스템 구축
* #### 이승환 : Arduino Module 개발, 모니터링 환경 구축, APK 개발 및 다운로드 환경 전반
* #### 함현우 : 공지사항 게시판, 장터 게시판 (CRUD, Secret), Reply 시스템 구축


# ⚙️ 개발 환경
***
* #### Configuration Management : ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
* #### Language : ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
* #### IDEs : ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
* #### Hosting : ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
* #### Frameworks :![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white) ![SpringBoot](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
* #### Database : ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
* #### Testing : ![JUnit5](https://img.shields.io/badge/JUnit5-f5f5f5?style=for-the-badge&logo=junit5&logoColor=dc524a)
* #### Other : ![Arduino](https://img.shields.io/badge/-Arduino-00979D?style=for-the-badge&logo=Arduino&logoColor=white)


# 🌏 배포 주소
***
### Web-Page : http://3.36.207.45:8080/


# 🔧 유스케이스 다이어그램
*** 
### Use Case : Member, Non-Member, Admin
![img_3.png](img_3.png)


# 📌 아키텍쳐
*** 
### 디렉토리 구조
<details>
  <summary>상세 보기</summary>
  <pre>
    <code>
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂itbank
 ┃ ┃ ┃ ┃ ┗ 📂smartFarm
 ┃ ┃ ┃ ┃ ┃ ┣ 📂aop
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AopConfig.java // Spring AOP 설정 관리, 비밀번호 해싱을 위한 Aspect Bean 등록.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PasswordEncoder.java // SHA-512 해시 알고리즘을 사용, 비밀번호 해싱 후 반환.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PasswordHashAspect.java // 로그인, 회원가입, 회원 정보 수정 메서드 실행 이전에 해싱 기능 수행.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂chat
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebSocketConfig.java // WebSocket 설정 관리, 중개, 전송, STOMP 엔드포인트 등록(실시간 교환).
 ┃ ┃ ┃ ┃ ┃ ┣ 📂components
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Paging.java // 페이징 기능을 구현하기 위한 클래스. 요청 페이지와 총 게시물 수로 페이지 정보 계산 수행.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardController.java // 게시판 및 댓글 전반 기능(CRUD) 구현 컨트롤러. 
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatController.java // 채팅 화면 제어를 위한 컨트롤러.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DownloadController.java // 다운로드 페이지 출력, APK 다운로드를 위한 컨트롤러.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HomeController.java // Main 화면 출력을 위한 컨트롤러.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberController.java // 회원 관리 기능(로그인, 가입, 수정, 삭제, 정보 찾기 및 초기화) 구현 컨트롤러
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageController.java // 메세지 수신과 전송을 위한 컨트롤러.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderController.java // 주문 정보 관리, 결제를 위한 컨트롤러.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂interceptor
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginInterceptor.java // 로그인이 필요한 작업 시, 비로그인인 경우 로그인 화면으로 리다이렉트.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NoticeInterceptor.java // 관리자 외 공지사항 글 작성 시도시 메세지 출력 및 로그인 화면으로 리다이렉트.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecretInterceptor.java // 작성자와 관리자만 비밀글을 조회할 수 있도록 메세지 출력 및 리다이렉트. 
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebConfig.java // 인터셉터 매핑을 위한 설정 관리.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardDAO.java // 게시판 기능 관련 DB 접근 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatDAO.java // 채팅 기능 관련 DB 접근 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberDAO.java // 회원 관리 기능 관련 DB 접근 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderDAO.java // 주문 기능 관련 DB 접근 객체.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardService.java // 게시판 기능 관련 비즈니스 로직 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatService.java // 채팅 기능 관련 비즈니스 로직 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DownloadService.java // 다운로드 기능 관련 비즈니스 로직 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberService.java // 회원 관리 기능 관련 비즈니스 로직 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderService.java // 주문 기능 관련 비즈니스 로직 객체.
 ┃ ┃ ┃ ┃ ┃ ┣ 📂vo
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardVO.java // 게시판 기능 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Board_TypeVO.java // 게시판 종류 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CartVO.java // 장바구니 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeliveryVO.java // 배송 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberVO.java // 회원 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageVO.java // 메세지 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderItemVO.java // 상품 주문 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrdersVO.java // 주문 상태 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReplyVO.java // 댓글 관련 DB 매핑 객체.
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SmartFarmApplication.java // Spring Boot Application 진입점.
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┗ 📜board.xml // 게시판 기능 관련 매퍼.
 ┃ ┃ ┣ 📂META-INF
 ┃ ┃ ┃ ┗ 📜additional-spring-configuration-metadata.json
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂download
 ┃ ┃ ┃ ┃ ┗ 📜IoT.apk // 다운로드를 위한 APK 파일.
 ┃ ┃ ┃ ┗ 📂img
 ┃ ┃ ┃ ┃ ┣ 📜arduino.jpeg // 상품 페이지에 사용될 이미지.
 ┃ ┃ ┃ ┃ ┣ 📜community.jpeg // Web-Page 사용 이미지.
 ┃ ┃ ┃ ┃ ┣ 📜company.jpeg // Web-Page 사용 이미지.
 ┃ ┃ ┃ ┃ ┣ 📜logo.png // Web-Page 사용 이미지.
 ┃ ┃ ┃ ┃ ┣ 📜mainImg.jpg // Web-Page 사용 이미지.
 ┃ ┃ ┃ ┃ ┗ 📜mobileApp.png // Web-Page 사용 이미지.
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣ 📜fBadd.html // 자유게시판 글 작성 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜freeBoard.html // 
 ┃ ┃ ┃ ┃ ┣ 📜freemarket.html // 
 ┃ ┃ ┃ ┃ ┣ 📜freemarket_view.html // 장터 상세 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜freemarket_write.html // 장터 글 작성 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜list.html // 자유게시판 전체 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜market.html // 장터 전체 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜notice.html // 공지사항 전체 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜notice_view.html // 공지사항 상세 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜notice_write.html // 공지사항 글 작성 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜QnA.html // QnA 전체 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜QnAadd.html // QnA 글 작성 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜QnA_view.html // QnA 상세 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜replys.html // 댓글 출력을 위한 View.
 ┃ ┃ ┃ ┃ ┗ 📜view.html // 자유게시판 상세 글 조회 시 출력되는 View.
 ┃ ┃ ┃ ┣ 📂chat
 ┃ ┃ ┃ ┃ ┣ 📜chat.html // 1:1 채팅을 위한 View.
 ┃ ┃ ┃ ┃ ┗ 📜chatdesign.html // 1:1 채팅의 편의성 시각 자료를 위한 View.
 ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┣ 📜findId.html // ID 찾기 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜findPw.html // PW 찾기 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜fintPw.html // 
 ┃ ┃ ┃ ┃ ┣ 📜login.html // 로그인 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜myPage.html // 로그인 후 Mypage 화면 접근 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜signUp.html // 회원 가입 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┗ 📜update.html // 회원 정보 수정 시 출력되는 View.
 ┃ ┃ ┃ ┣ 📂pay
 ┃ ┃ ┃ ┃ ┣ 📜cart.html // 장바구니 접근 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜details.html // 제품 페이지 접근 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜market.html // 
 ┃ ┃ ┃ ┃ ┣ 📜Message.html // 상품 구매 상황에서 메세지 출력 및 리다이렉트를 위한 View.
 ┃ ┃ ┃ ┃ ┣ 📜newUpdate.html // 주문 정보 수정 시 출력되는 View.
 ┃ ┃ ┃ ┃ ┣ 📜order.html //
 ┃ ┃ ┃ ┃ ┣ 📜orderPrepare.html // 
 ┃ ┃ ┃ ┃ ┗ 📜orderStatus.html // 배송 정보 확인 시 출력되는 View.
 ┃ ┃ ┃ ┣ 📜company.html // 회사 소개 페이지 접근 시 출력되는 View.
 ┃ ┃ ┃ ┣ 📜download.html // 앱 다운로드 페이지 접근 시 출력되는 View.
 ┃ ┃ ┃ ┣ 📜footer.html // Web-Page 하단에 표시되는 View.
 ┃ ┃ ┃ ┣ 📜header.html // Web-Page 상단에 표시되는 View.
 ┃ ┃ ┃ ┣ 📜home.html // 메인 화면 접근 시 표시되는 View.
 ┃ ┃ ┃ ┗ 📜piece.html //
 ┃ ┃ ┗ 📜application.yml 
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂itbank
 ┃ ┃ ┃ ┃ ┗ 📂smartFarm
 ┃ ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberControllerTest.java // 고객 정보 관리 컨트롤러 테스트 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberServiceTest.java // 고객 정보 관련 비즈니스 로직 테스트 객체.
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberTest.java // 테스트를 위한 임의 정보 입력 객체.
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SmartFarmApplicationTests.java // Test Application 진입점.
</code>
</pre>
</details>



