package ch16;

import java.io.*;

public class FileStreamUserInput {

    public static void main(String[] args) {
        writeUserInputToFile("user_input.txt");
        readFromFile("user_input.txt");
    }

    public static void writeUserInputToFile(String fileName) {
        /**
         * 키보드 입력 -> InputStreamReader(System.in) (바이트 -> 문자 변환)
         * 파일에 쓰기 -> FileWriter(fileName) (문자 기반 파일 출력)
         *
         */

        try (InputStreamReader reader = new InputStreamReader(System.in);
             FileWriter writer = new FileWriter(fileName, true)) {

            System.out.println("텍스트를 입력하세요");

            int charCode;
            while ((charCode = reader.read()) != -1) {
                writer.write(charCode);


                writer.flush();
            }

            System.out.println(fileName + "에 텍스트를 모드 작성 함");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    //직접 코드 작성해 보기
    //파일에서 텍스트를 읽는 메서드를 직접 구성해 보세요
    public static void readFromFile(String fileName) {
        // ...파일에 내용을 문자 기반으로 읽어서 콘솔창에 출력
        try (FileReader reader = new FileReader(fileName)) {
            int code;

            while ((code= reader.read()) != -1) {
                System.out.print((char) code);
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}