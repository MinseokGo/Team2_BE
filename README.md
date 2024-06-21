# 우리들의 네컷 모음집 "네모" - 2조

<img width="403" alt="image" src="https://github.com/Step3-kakao-tech-campus/Team2_BE/assets/98508955/0f52fc19-e558-430c-be8c-236c1050e833">  


## 🔅 프로젝트 소개

 프로젝트 네모는 함께 찍은 네컷 사진들을 그룹 다이어리에 보관하고, 동시에 편집이 가능한 **공유형 다이어리 꾸미기 서비스**입니다.  
   (물론 다른 사진들도 가능합니다 😊)

<br>

### 프로젝트 제안 배경

>요즘 사회는 물질적 소유를 중요시하는  '소유 경제'에서 벗어나 어떤 경험을 했는지가 중요한 **경험 경제**로 변화하고 있다고 합니다.  
>사람들은 자신의 소중한 경험을 다른 사람들과 공유하고, 그 경험을 통해 자신을 표현하고 싶어합니다.  
>이러한 흐름을 반영하여 **소중한 경험을 다같이 공유하고 꾸밀 수 있다면 얼마나 좋을까?** 라는 생각에서 저희의 프로젝트는 시작되었습니다.
>
>MZ세대의 `"꾸미기 문화"`는 주류 트렌드로 확실하게 자리잡고 있습니다. MZ 트렌드를 다루는 미디어 캐릿에서 **"별다꾸"** (별걸 다 꾸민다) 라는 신조어가 생길 정도이니 말입니다.  인스타그램 해시태그 게시물 수에 따르면  `'다꾸'`가 413만개, `'인생네컷'`이 125만개에 이르는 것으로 보아, 10-30 세대들이 이 두 키워드에 큰 관심을 가지고 있다는 것을 알 수 있습니다.
>
>저희는 이 두 키워드를 결합하여, **함께 찍은 사진들을 그룹 다이어리에 보관**하고, **동시에 편집**이 가능한 공유형 다이어리 꾸미기 서비스인 **네모** 를 제안합니다.

<br>

### 개발 기간
2023.09-11 (카카오 테크 캠퍼스 1기 - 3단계 진행 기간)

<br>

### 사용 기술 및 협업 스텍
- `jdk 11`
- `springboot 2.7.15`
- `mysql 8.0.28`
- `redis 7.2`
- `spring security`
- `open feign`
- `aws 2.26`
- [`figma`](https://www.figma.com/file/mHEG9xBpKbpSWu7x0m8hjF/%EB%84%A4%EC%BB%B7-%EC%95%A8%EB%B2%94?type=design&node-id=0-1&mode=design)
- `slack`
- [`notion`](https://gominseok.notion.site/e0babd4fb0be409d9d42456e75d67a63?v=01b4beedd4a7493ea44bd346c99775a3&pvs=4)

<br>


## 🙋‍♀️ 서비스 소개
> 실시간 공유형 다이어리 꾸미기 서비스 **네모**
<br>

**🫂 나만의 포토 앨범 만들기**   
   - 친구, 연인, 가족, 혼자와 같은 다양한 카테고리로 나만의 포토 앨범을 만들 수 있어요!
   - 이 앨범은 그룹원들만이 공유하고 감상할 수 있는 **소중한 공간👨‍👩‍👦‍👦**이 될 것 입니다.
     
**⏱️ 동시 편집 기능**
   - 네모는 여러 사람이 **동시에** 사진을 추가하거나 편집할 수 있어요.
   - 그래서 각자의 집에서도 서로가 어떤 사진을 추가하고 어떻게 꾸미는지를 **실시간**으로 확인👀하고 함께 할 수 있답니다.
     
**💻  QR 인식 기능**
   - 네모 앨범은 **QR 코드**를 통해 네컷 사진을 바로 불러올 수 있어요.
   - 이를 통해, 사진이나 앨범을 서로 공유하고 관리하는 것이 더욱 **간편**해질 거에요.
    
**🏃‍♀️ 도전과제**
   - 네모 앨범은 그룹원들이 함께 혹은 개인적으로 다양한 **도전과제**를 수행할 수 있도록 해요!
   - 또한, **골드 단계🏅**를 수행하면 나만의 **칭호**도 획득할 수 있답니다.
   -  이를 통해 사진찍고 꾸미는 것이 더욱 **즐거운 경험✨**으로 변화할 거에요.
   
**🗑️  휴지통 기능**
   - 그룹원이 삭제한 페이지를 다시 확인하고 싶다면, 휴지통에서 **복구**할 수 있어요.
   - 휴지통은 **최대 7일간** 삭제된 페이지를 보관하니, 중요한 페이지를 실수로 삭제하더라도 걱정하지 마세요.
  
<br>

<br>

## 🗂️ 최종 ERD

![image](https://github.com/Step3-kakao-tech-campus/Team2_BE/assets/98508955/0e57681d-1c10-443b-8bbc-a738ecb4005b)


<br>

### 프로젝트 구조

```
🗂️ 
└─ src
   └─ main
      ├─ java.cpm.example.team2_be
      │  └─ com
      │  ├─ BaseEntity.java
      │  ├─ Team2BeApplication.java
      │  ├─ 📦 album
      │  │  ├─ 📦 member
      │  │  └─ 📦 page
      │  │     └─ image
      │  ├─ 📦 auth
      │  ├─ core
      │  │  ├─ config
      │  │  ├─ error
      │  │  │  └─ exception
      │  │  ├─ security
      │  │  └─ utils
      │  ├─ error
      │  ├─ 📦 reward
      │  │  └─  progress
      │  ├─ 📦 title
      │  │  └─ collection
      │  ├─ 📦 trash
      │  └─ 📦 user
      └─ resource
```

<br>

### 고민해본 것들
1. 이미지를 저장하는 과정에 대한 고민 </br>
(1) 서버에 직접 저장</br>
(2) 클라우드에 이미지 저장(aws s3) → url제공 → url 형식으로 DB에 저장</br>
* 이미지 데이터가 많아 조회, 저장 최적화를 신경 쓰고 있음. 서버에 직접 저장하는 방식은 이미지 데이터가 많은 서비스에서는 서버의 디스크 공간을 차지하고 스토리지 용량이 부족해질 수 있겠다고 생각함
* 이미지 로딩 시 서버의 부하가 생길 수 있다는 단점.
* url 형식으로 DB에 저장하는 방식도 추가 HTTP 요청 및 대기 시간, URL 동기화 관리, 스토리지 용량 등의 단점이 존재.
* 비용적인 문제가 있더라도 클라우드 서비스(AWS S3)를 사용하는 것으로 결정

2. 소셜 로그인, 회원가입을 구현 중에 있는데 외부 API에서 인가 코드와 어세스 토큰을 서비스 서버로 Redirect 시켜 JWT를 발급하는 프로세스로 개발 과정에서 Redirect 주체에 대한 고민
* (방법1) 클라이언트를 Redirect 주체로 두어 서버로 어세스 토큰을 가지고 JWT를 요청한다.
* (방법2) 서버에서 클라이언트로 JWT를 쿠키에 담아 302 Redirect 한다.
* 서버에서 인가 코드, 어세스 토큰을 받고 외부 API에 접근해 유저 회원가입 로직을 처리하는 것으로 결정

3. 앨범 컨트롤러와 앨범 멤버 컨트롤러 분리에 대한 고민
```
/albums
/albums/{albumsId}/members
```
* uri의 경우 둘 다 ‘/albums’로 시작하는데 컨트롤러를 합치는 것이 맞는지에 대해 고민
* 즉, 도메인 분리에 대한 고민을 하였음
* 앨범 멤버는 앨범에 종속 되기 때문에 멤버 패키지를 앨범 패키지에 import 하였음.

4. User 인증 객체 추출에 대한 고민</br></br></br></br>
![Untitled](https://github.com/Step3-kakao-tech-campus/Team2_BE/assets/101192772/8c44abd4-124b-47e8-9c14-1d017d99e665) </br>
* 해당 구문에 대해서 팀 내 두 가지 관점이 나옴
* 첫번째로는 로그인한 유저의 정보를 임시 객체로 만들어서 UserDetails에 담는것보단 DB에서 해당 유저의 정보를 조회 후에 담는 것이 구조적으로 맞는 것 같다. 또한 이렇게 함으로써 유저 빌더에 id를 닫을 수 있다는 부가 장점도 있다는 의견
* 두번째는 filter는 DS 이전에 실행되기 때문에 Filter에서 Repository를 가져와 DB를 조회하는 것은 역할의 혼합(DB 엑세스는 주로controller 또는 service 계층에서 처리)과 이로 이한 유지보수의 어려움 또한 확장성 측면에서 DB를 가져오는 것이 고민됨.
* 만약 유저의 실제 정보를 가져와야한다면 sevice 단이 해당 기능을 가로채서 service 내 method를 통해 가져오는 것이 역할에 맞지 않을까? 라는 의견.
* 필터링할 유저가 실제 존재하는지 확인해야 하기 때문에 Resository 에 대한 의존을 추가하고 직접 조회하는 것으로 결정
* 그렇지 않으면 서비스 메서드가 추가되어 서비스 클래스의 복잡도가 높아짐

5. 반환 json 에 따른 테이블 설계 고민
* 앨범 페이지 내 요소를 다음과 같이 서버에서 반환. 타입에 따라( ex) image, text 등) 반환할 때 사용하지 않는 필드들이 존재함.
* 하지만 프론트에서는 아래와 같은 형식으로 똑같이 반환하길 원함.
```json
{
    "id": "76e5b053-a67c-4698-2442-aa6811707bdd",
    "type": "text",
    "name": "Text",
    "parentId": "page",
    "childIndex": 1,
    "point": [
        248.09,
        261.19
    ],
    "rotation": 0,
    "text": "햐하하ㅏㅎ\n ",
    "style": {
        "color": "black",
        "size": "small",
        "isFilled": false,
        "dash": "draw",
        "scale": 1,
        "font": "script",
        "textAlign": "middle"
    },
		"albumId" : 1,
}
```
* 이러한 상황에서 DB Table을 타입과 상관없이 TD Shape라는 Table로 통합해서 타입별로 사용하지 않는 필드는 null 값으로 처리하는 것이 좋을 지
* Image, Text Table 등으로 나눠서 관리하는 것이 좋은 지 고민입니다. 하나로 관리하면 데이터 일관성과 관리에 편하지만 복잡성 증가와 가독성이 저하 고려
* 분리해서 관리하면 변경 및 확장에 용이하지만 데이터가 중복된다는 단점이 존재
* 테이블을 분리하고 Response에서 조합해서 DTO를 내려주는 것으로 결정
* 추후 사용 가능성을 고려해서 안쓰는 필드도 Response에 내려주는 것으로 결정

6. 엔티티 추상화에 대한 고민 <br>
<img width="376" alt="스크린샷 2024-06-21 오후 5 10 49" src="https://github.com/MinseokGo/Team2_BE/assets/96585636/2a445f9b-0cd3-4940-813a-9dc35e948a9b"> <br><br>
* PK, createAt, updatedAt과 같은 엔티티에서 중복되는 필드들의 추상화를 고민하였음
* 추후 필드 수정이 필요할 때 각 엔티티마다 수정해주어야 하는 유지보수에서의 불편함을 인지
* BaseEntity를 통해 공통 필드들을 추상 클래스로 책임 분리함

7. 앨범 멤버 조회 기능 성능 이슈
- 앨범 멤버(member)는 유저(user)와 앨범(album)을 외래키로 참조하고 있음
- 특정 앨범의 특정 앨범 멤버를 찾으려면 앨범을 참조해서 앨범 멤버 리스트(members)를, 멤버 리스트에서 유저 ID 로 특정 앨범 멤버를 찾아내야해서 검색의 효율이 떨어진다고 판단
- 특히 앨범과 앨범 멤버, 그리고 유저는 해당 서비스의 핵심 도메인이며 제일 빈번하게 조회되는 엔티티들임
- 앨범 ID 와 유저 ID 로 다중 인덱싱을 하기로 판단
![스크린샷 2024-04-22 오후 4.37.42.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/4f739918-9973-4432-9d12-660f698cf46c/e784f379-21b6-4678-8186-b914d692bbc1/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2024-04-22_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.37.42.png)
- 첫번째로 앨범 ID 를 기준으로 정렬하고 두번째로 유저 ID 를 기준으로 정렬해서 해당 멤버를 빠르게 찾을 수 있도록 함.
8. 앨범 페이지 조회 기능 성능 이슈
- 앨범 조회 다음으로 가장 많이 호출되는 앨범 페이지 조회 API 는 한 앨범당 개수 제한 없이 페이지가 존재할 수 있다는 것을 파악
- 한번에 조회할 수 있는 페이지를 제한하여 서버의 과부화를 미리 방지하고 최적화 하고자 함
- Pageable 인터페이스를 도입하여 한번에 응답할 수 있는 페이지를 제한함
![image](https://github.com/MinseokGo/Team2_BE/assets/96585636/e45ba54c-15ce-4796-a4b5-a09dc4aa460e)
![image](https://github.com/MinseokGo/Team2_BE/assets/96585636/458c5697-c9a0-4a6b-8d6f-ffb3a54a4dcb)

