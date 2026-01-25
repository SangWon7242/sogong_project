--> 서공 프로젝트 개발 노트 <--

# % 0주차
## 웹 프로젝트 기획 및 구성
- 프로젝트 생성

# % 1주차
## 회원(이용자) 관리 시스템 구축
(1주차 작업 커밋)
- HomeController 구현 및 "/home" 경로로 접속시 "Hello Sogong!" 출력
- Member 클래스 구현 및 Member 인스턴스 생성마다 ID가 자동으로 1씩 증가
- 타임리프 적용
- MemberController 구현
- "/member/join" 경로로 접속시 회원가입 폼 출력
- 회원가입 기능 구현
- 스프링 시큐리티 적용
- SecurityConfig 구현
- MemberService 구현 및 UserDetailsService를 상속하여 loadUserByUsername 오버라이딩
- MemberRepository 구현 및 회원을 username으로 찾는 매소드 구현
- "/member/login" 경로로 접속시 로그인 폼 출력
- 스프링 시큐리티가 대신 로그인을 처리
- 로그인시 마이페이지로 리다이렉트
- "/member/myPage" 경로로 접속시 로그인한 회원 정보(비밀번호 포함) 출력

# % 2주차
## 회원(이용자) 관리 시스템 구축
(파일 수정 커밋)
- member, home 파일을 가지고 있는 파일의 이름 변경 (local -> domain)

(entity 수정 커밋)
- JPA 적용
- Member 클래스에서 id가 자동으로 1씩 증가하도록 수정
- Member 클래스에서 name을 username으로 변경한 뒤 겹치지 않도록 수정

(entity 관련 수정 커밋)
- Member 클래스를 빌더를 이용해서 생성

(DB 연결 커밋)
- mariaDB 적용
- Member 클래스에서 id의 자료형 변경 (String -> int)
- application.yaml 파일에 JPA 및 DB 정보 입력

(mvc 분리 및 DB 저장 불러오기 구현 커밋)
- MemberDto 클래스 구현 및 적용
- MemberRepository를 interface로 변경한 뒤 JpaRepository 상속
- MemberRepository에 findByUsername 매소드 구현 및 적용
- MemberService에 회원 정보를 DB에 저장하고 불러오는 createMember 매소드 구현

(로그아웃 구현 커밋)
- "/member/logout" 경로로 접속시 로그아웃 폼 출력
- 스프링 시큐리티가 대신 로그아웃을 처리

(테스트 회원 생성 커밋)
- InitData 클래스 구현
- profile을 이용해 test 모드일 때만 테스트 데이터 생성
- application.yaml 파일을 일반, 개발, 테스트, 운영 모드 네가지로 분리

(테스트 데이터 문제 해결 커밋)
- 테스트 데이터의 비밀번호가 이중 암호화되는 문제 해결
- SecurityConfig 클래스에서 다양한 상황에 대한 대처 능력 강화

(MemberDto 관련 수정 커밋)
- MemberDto 생성자 매소드 추가
- createMember 매소드 수정
