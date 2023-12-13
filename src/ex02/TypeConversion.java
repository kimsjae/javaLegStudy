package ex02;
// 형변환 실습하기
public class TypeConversion {
    public static void main(String[] args) {
        // 다음 코드의 실행 결과를 예측해보자.

        int i;
        double f;

        f = 1 / 5;
        System.out.println(f);

        f = (double) 1 / 5;
        System.out.println(f);

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i);
    }
}
