package ch08.example;

public class StringEx02 {
    public static void main(String[] args) {

        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        //String[] urlTest = url.split("&");
        //String[] userTest = urlTest[1].split("=");

        String[] urlTest = url.split("\\?");
        String[] urlTest2 = urlTest[1].split("&");
        String[] urlTest3 = urlTest2[0].split("=");
        String ssar = urlTest3[1];
        System.out.println(ssar);

        String[] urlTest4 = urlTest2[1].split("=");
        String asd = urlTest4[1];
        System.out.println(asd);


//        for (String ts : urlTest) {
//            System.out.println(ts);
//        }
//
//        for (String ts : userTest) {
//            System.out.println(ts);
//        }

        // username값과, password값 찾아보기
        String username;
        String s = url.substring(30, 34);
        //System.out.println(s);
        String password;
    }
}