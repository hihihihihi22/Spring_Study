## 📚 학습 출처

이 프로젝트는 에이콘아카데미 에서 진행한 Spring Boot 기초 강의를 바탕으로 작성되었습니다. 프로젝트의 코드 및 내용은 강사님의 지도를 따라 학습한 결과물이며, Spring Boot의 주요 개념을 이해하고 실습하는 데 중점을 두었습니다.

# 🌱 Spring Boot 기초 학습 프로젝트

이 프로젝트는 **Spring Boot**의 핵심 개념을 학습하고 실습한 내용을 담고 있습니다. 각 폴더는 Spring Boot의 주요 개념과 기능을 실습한 결과물로, 웹 애플리케이션 개발에 필요한 다양한 기술들을 익히기 위한 예제가 포함되어 있습니다.

## 📂 프로젝트 구조

- **Boot01_Bean**: Spring에서의 빈(Bean) 관리와 의존성 주입(DI) 학습.
- **Boot02_Controller**: MVC 패턴에서의 Controller 역할 학습.
- **Boot03_jsp**: JSP와의 연동 및 데이터 바인딩 실습.
- **Boot04_Thymeleaf**: Thymeleaf 템플릿 엔진을 이용한 프론트엔드 연동.
- **Boot05_MyBatis**: MyBatis를 이용한 데이터베이스 연동 실습.
- **Boot06_interceptor**: Spring Interceptor를 이용한 요청 전후 처리 학습.
- **Boot07_FileUpload**: 파일 업로드 기능 구현 실습.
- **Boot08_Security**: Spring Security를 이용한 인증 및 권한 관리 학습.
- **Boot09_AOP**: 관점 지향 프로그래밍(AOP)의 기초 개념과 적용.
- **Boot10_Restful_API**: RESTful API 설계 및 구현 학습.
- **Boot11_Example**: 다양한 예제를 통한 Spring Boot 기능 심화 학습.
- **Boot12_JWT**: JWT(JSON Web Token)를 이용한 인증 처리 학습.
- **Boot13_Jpa**: Spring Data JPA를 이용한 데이터베이스 처리 실습.
- **Boot14_ReactAPI**: Spring Boot와 React를 연동한 API 통신 실습.
- **Boot15_jsp**: JSP를 활용한 추가 예제 학습.
- **HelloBoot**: Spring Boot 프로젝트 초기 설정 및 기본 개념 학습.

## 🛠️ 사용 기술

- **Spring Boot**: 자바 기반 웹 애플리케이션 프레임워크.
- **Spring Security**: 인증 및 권한 관리.
- **MyBatis**: SQL 매퍼 프레임워크.
- **JPA**: 자바의 ORM(Object Relational Mapping) 기술.
- **Thymeleaf**: 템플릿 엔진.
- **JWT**: 웹 인증 토큰.
- **REST API**: RESTful 웹 서비스 설계 및 구현.

## 📌 설치 및 실행 방법

```bash
# 프로젝트 클론
git clone https://github.com/your-repo-url.git

# 프로젝트 디렉토리로 이동
cd project-folder

# 패키지 설치
./mvnw install

# Spring Boot 애플리케이션 실행
./mvnw spring-boot:run
