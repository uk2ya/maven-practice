# 프로젝트 소개
- 자바 웨에에엑 
- 호애애애애앵 ㅠㅠ
- 자바 웨에에엑 #2 우에에에에에엑
ㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄲㄱ

1. Readme.md 파일을 수정하고 commit 후, push 연습해보기

2. 프로젝트 빌드 도구로는 다음과 같은 도구들을 활용할 수 있습니다.
- 파일 탐색기
- IDE
- ant, maven, gradle
> 자동화 빌드 도구인 maven을 활용했을 때 , 장점은 무었인가요?
= 복붙 쌉가능 개편함

3. 단위 테스트 도구인 JUnit은 각 모듈 단위를 테스트할 때 유리합니다.
- 테스트 메소드 헤더를 작성하는 방법은??
=
```
@Test
public void testMethodName() {
    // 테스트 코드
}
```
- 테스트 메소드 값 일치, 참조 일치를 assertion 하는 메소드는?
=
```
@Test
public void testValueEquality() {
    String s1 = new String("JUnit");
    String s2 = new String("JUnit");
    assertEquals(s1, s2);
}
```

4. VCS git을 활용하기 위해 remote repository 제공하는 대표적인 서비스에는 github가 있습니다.
- 운격 저장소에 기록된 최신의 기록점을 local repository로 내려 받는 동작은?
= pull
- 원격 저장소에 기록된 프로젝트 전체 내용을 복제해서 local repository로 만드는 동작은?
= 트리 어쩌구? 복사?? 리포지토리로 받아와서 복제.
