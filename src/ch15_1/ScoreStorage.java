package ch15_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreStorage {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("==시험 저장 ==");
        System.out.println("1. 점수 저장");
        System.out.println("2. 결과 분석");
        String choice = sc.nextLine();
        if(choice.equals("1")) {
            savaScore(sc);
        }else
        savaScore(sc);
        printScore();


    }

    private static void savaScore(Scanner sc) {
        System.out.println("학생 수를 입력하세요 : ");
        // Integer.parseInt() --> 문자열 값 --> int 형으로 변환

        try {
            // 예상 값
            int count = Integer.parseInt(sc.nextLine()) ;

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < count; i++) {
                System.out.println(i + "번째 학생 점수");
                // sb 에 계속 append() 10 + 20 + 30 +
                // 10공백20공백30공백
                String score = sc.nextLine();
                sb.append(score);
                sb.append(" ");
            }

            try (FileOutputStream fos = new FileOutputStream("score.txt")) {
                fos.write(sb.toString().getBytes());
                System.out.println("저장 완료");
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static void printScore() throws IOException {
        System.out.println("점수 분석 총점/평균");
        try (FileInputStream fin = new FileInputStream("score.txt")) {

            // 파일 전체를 문자열로 읽기
            StringBuffer sb = new StringBuffer();
            int data;
            while ( (data = fin.read()) != -1) {
                sb.append((char) data);
            }
            // 공백 기준으로 문자열을 자르는 split .. - -> 배열 char 반환

            String[] parts = sb.toString().trim().split(" ");
            int total = 0;
            for (String part : parts) {
                //                              80
                //                              90
                //                              ...
                System.out.println("점수 : " + part);
                // 문자열을 ---> 정수값으로 형변환 하는 방법(배우지 않았)
                total += Integer.parseInt(part);
            }
            System.out.println("총점 : " + total);
            System.out.println("평균 : " + (double)total / parts.length);

            System.out.println(sb.toString());


//            System.out.println((char) fin.read());
//            System.out.println((char) fin.read());
//            System.out.println((char) fin.read());
//            System.out.println((char) fin.read());
//            System.out.println((char) fin.read());


        }
    }

}





