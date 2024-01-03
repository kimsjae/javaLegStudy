package ch08.example;

public class StringEx01 {

    public static String encoding(String data) {
//        변수 num을 1로 초기화합니다. 이 변수는 현재 문자의 연속된 개수를 저장하는 역할을 합니다.
        int num = 1;

//        빈 문자열 result를 초기화합니다. 이 변수는 인코딩된 결과를 저장하는 역할을 합니다.
        String result = "";

//        문자열 data를 split 메서드를 사용하여 각각의 문자로 분리한 후, arr 배열에 저장합니다.
        String[] arr = data.split("");

//        반복문을 통해 data의 각 문자를 순회합니다. 인덱스 i는 1부터 시작합니다.
        for (int i = 1; i < data.length(); i++) {

//        만약 arr[i - 1]과 arr[i]가 다른 문자라면, 이전 문자의 연속된 개수와 문자를 result에 추가합니다. 그리고 num을 1로 초기화하고 반복문의 다음 단계로 이동합니다.
            if (!arr[i - 1].equals(arr[i])) {
                result = result + arr[i - 1] + num;
                num = 1;
                continue;
            }

//        만약 arr[i - 1]과 arr[i]가 같은 문자라면, num을 1 증가시킵니다.
            num++;
        }

//        반복문이 종료되면, result를 반환합니다.
        return result;
    }

    public static String decoding(String encodingData) {
//        빈 문자열 result를 초기화합니다. 이 변수는 디코딩된 결과를 저장하는 역할을 합니다.
        String result = "";

//        문자열 convert를 split 메서드를 사용하여 각각의 문자로 분리한 후, arr 배열에 저장합니다.
        String[] arr = encodingData.split("");

//        반복문을 통해 convert의 각 문자를 순회합니다. 인덱스 i는 1부터 시작합니다.
        for (int i = 1; i < encodingData.length(); i++) {

//        변수 s에 arr[i-1] 값을 저장합니다. 이는 디코딩할 문자를 의미합니다.
            String s = arr[i - 1];

//        변수 num에 arr[i] 값을 정수로 변환하여 저장합니다. 이는 디코딩할 문자의 연속된 개수를 의미합니다.
            int num = Integer.parseInt(arr[i]);

//        내부 반복문을 통해 num만큼 문자 s를 result에 추가합니다.
            for (int j = 0; j < num; j++) {
                result += s;
            }

//        변수 i를 1 증가시켜서 다음 디코딩할 문자로 이동합니다.
            i++;
        }
//        반복문이 종료되면, result를 반환합니다.
        return result;
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
        String encodingData = "A2B3C4D5";

        // 인코딩 A2B3C4D5
        data += ".";
        System.out.println(encoding(data));

        // 디코딩 AABBBCCCCDDDDD
        System.out.println(decoding(encodingData));
    }
}