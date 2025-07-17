# 💳 Spring Boot & Spring Security 기반 뱅킹 포털 REST API


[![GitHub Repo](https://img.shields.io/badge/GitHub-UI%20Repo-blue.svg?style=flat-square)](https://github.com/cheonseungbeom/weavus_seungbeom_ui)  
[![GitHub Repo](https://img.shields.io/badge/GitHub-API%20Repo-blue.svg?style=flat-square)](https://github.com/cheonseungbeom/weavus_seungbeom_api)

---

## 🖥 뱅킹 포털 UI

🔗 [https://github.com/cheonseungbeom/weavus_seungbeom_api](https://github.com/cheonseungbeom/weavus_seungbeom_api)

![image](https://github.com/user-attachments/assets/e18c8486-3c4b-4477-b043-824bf4a14473)

---

## 🧾 프로젝트 소개

뱅킹 포털 API는 사용자 계정, 자금 이체, 거래 내역 등을 관리할 수 있는 다양한 엔드포인트를 제공합니다.  
이 프로젝트는 사용자가 **안전하고 효율적인 금융 서비스**를 이용할 수 있도록 설계되었습니다.

---

## 📊 데이터베이스 테이블 구조 (ERD)

<img width="628" height="632" alt="스크린샷 테이블" src="https://github.com/user-attachments/assets/a97ab09e-796d-48cb-be8f-c9d8f365365b" />

> 위 다이어그램은 본 프로젝트의 핵심 테이블 구성(ERD: Entity-Relationship Diagram)을 나타냅니다.

---

### 🧾 주요 테이블 설명

#### 1. `user`
- 사용자 정보 저장
- 필드: `name`, `email`, `password`, `phone_number`, `address` 등

#### 2. `account`
- 하나의 사용자에게 여러 계좌 연결 가능
- 필드: `account_number`, `balance`, `branch`, `ifsc_code`, `user_id`

#### 3. `transaction`
- 계좌 간 이체 기록
- 필드: `amount`, `transaction_type`, `transaction_date`, `source_account_id`, `target_account_id`

#### 4. `token`
- 인증 토큰 저장 (ex: 로그인 유지)
- 필드: `token`, `created_at`, `expiry_at`, `account_id`

#### 5. `passwordresettoken`
- 비밀번호 초기화를 위한 토큰 저장
- 필드: `token`, `expiry_date_time`, `user_id`

#### 6. `otp_info`
- 일회용 비밀번호(OTP) 저장용 테이블
- 필드: `account_number`, `otp`, `generated_at`

#### 7. `passwordresettoken_sequence`
- `passwordresettoken`의 시퀀스 관리용 테이블

---

### 🔗 관계 요약

- `user` ↔ `account`: 1:N 관계 (한 명의 유저가 여러 계좌 보유)
- `account` ↔ `transaction`: self-join (송금 계좌와 수신 계좌 모두 포함)
- `account` ↔ `token`: 1:N 관계
- `user` ↔ `passwordresettoken`: 1:N 관계




---
## ✨ 주요 기능

- **회원 가입**: 이름, 이메일, 주소, 전화번호 입력으로 계정 생성  
- **PIN 관리**: PIN 생성 및 변경 기능  
- **현금 입금 및 출금**: 계좌에 돈을 입금하거나 출금  
- **자금 이체**: 다른 계정으로 송금  
- **거래 내역 확인**: 계좌의 거래 이력 조회

---

## 🛠 사용 기술

![Spring Boot](https://github.com/abhi9720/BankingPortal-API/assets/68281476/31896d20-16d9-4fe1-a534-0490841de4b9)  
![MySQL](https://github.com/abhi9720/BankingPortal-API/assets/68281476/c09bc4ac-c0ca-4f7c-9c6e-8eb9818eb35b)  
![Angular](https://github.com/abhi9720/BankingPortal-API/assets/68281476/78c75fff-e8a8-49c6-9897-34b08b2c9308)  
![JWT](https://github.com/abhi9720/BankingPortal-API/assets/68281476/3647613e-1d6e-4bc4-98b6-2da5648659f9)  
![Swagger](https://github.com/abhi9720/BankingPortal-API/assets/68281476/8a5c0b00-776b-444e-bc24-36fc6bfe4c41)  
![Maven](https://github.com/abhi9720/BankingPortal-API/assets/68281476/b56a7167-6a3a-49a0-8b8a-8a4e3e71a383)  
![Bootstrap](https://github.com/abhi9720/BankingPortal-API/assets/68281476/b5c86e65-cbe8-400a-afeb-895846601da7)

---

## ✅ 개발 예정 기능 (TODO)

- 대시보드 차트 UI 수정  
- 테이블에 페이지네이션 추가  
- JWT 토큰을 DB에 저장하고 로그아웃 시 삭제  
- 계정 로그인 시 이메일 알림 전송  
- 거래 내역서 이메일로 발송

---

## 🚀 설치 및 실행 방법

1. 저장소 클론:

    ```sh
    git clone https://github.com/yourusername/banking-portal-api.git
    ```

2. 프로젝트 디렉토리로 이동:

    ```sh
    cd banking-portal-api
    ```

3. MySQL 설정:

    - MySQL 데이터베이스 생성
    - `application.properties.sample` 파일을 복사하여 `application.properties`로 이름 변경
    - 데이터베이스 정보 등 환경 설정 변경

4. 프로젝트 빌드 및 실행:

    ```sh
    mvn spring-boot:run
    ```

---

## 📸 스크린샷
<img width="1906" height="904" alt="스크린샷 대문" src="https://github.com/user-attachments/assets/6f020900-6092-4eaf-986a-c3e21df28879" />
<img width="1901" height="769" alt="스크린샷 2025-07-17 102751" src="https://github.com/user-attachments/assets/4fcf68a5-e51d-462e-8e8a-9ed7d6d25bb5" />



---

## ⚠️ 에러 처리

이 API는 다음과 같은 상황에 대해 **전역 예외 처리(Global Exception Handling)**를 구현하고 있습니다:

- 계좌 없음  
- 인증 실패  
- 잔액 부족 등

---
