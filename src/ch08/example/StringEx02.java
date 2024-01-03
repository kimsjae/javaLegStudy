package ch08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String[] username1 = url.split("\\?");
        String[] username2 = username1[1].split("&");
        String[] username3 = username2[0].split("=");
        String username = username3[1];

        String[] password1 = url.split("\\?");
        String[] password2 = password1[1].split("&");
        String[] password3 = password2[1].split("=");
        String password = password3[1];

        System.out.println(username);
        System.out.println(password);
    }
}