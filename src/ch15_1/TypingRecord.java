package ch15_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== ");
        System.out.println("1. 문장 저장");
        System.out.println("2. 기록 보기");
        System.out.print("선택: ");
        String choice = sc.nextLine();
        
        if(choice.equals("1")) {
            saveRecord(sc);
        } else if (choice.equals("2")) {
            printRecord();
        }


        sc.close();


 
    }  // end of main

    private static void printRecord() throws IOException {
        System.out.println("\n===저장된 기록 ===");

        try (FileInputStream fin = new FileInputStream("typing_record.txt")) {
            int data;
            while( (data = fin.read()) != -1); {
                System.out.println((char) data); // 71 
            }
            
        }

    }




    private static void saveRecord(Scanner sc) {
        System.out.println("연습한 문장을 입력하세요 : ");
        String input = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream("typing_record.txt", true)) {
            fos.write(input.getBytes());
            //줄 바꿈 추가
            fos.write("\n".getBytes());
            System.out.println("저장 완료!");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

       // 메모리 누수 방지
    }
}
