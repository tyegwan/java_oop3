//package ch15_1;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//
//public class Upgrade {
//    public static void main(String[] args) {
//        String key;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("선택하시오");
//        System.out.println("1. 코드 쓰기");
//        System.out.println("2. 코드 읽기");
//        String choice = sc.nextLine();
//
//        if (choice.equals("1")) {
//            saveCode(sc);
//        } else {
//            readCode();
//        }
//    }
//
//    public static void readCode() {
//
//        try (FileInputStream fis = new FileInputStream("typing_record_upgrade")) {
//            int data;
//            data =
//            System.out.println("복화화 키 : " + );
//            System.out.println("복화화 결과 : " + );
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//
//    }
//}
//
//
//public static void saveCode(Scanner sc) {
//
//    try (FileOutputStream fos = new FileOutputStream("typing_record_upgrade")) {
//        System.out.print("암호화 할 키 입력하세요 : ");
//        String key = sc.nextLine();
//        System.out.print("저장할 메모를 입력하세요 : ");
//        String input = sc.nextLine();
////                fos.write(sb);
//        //줄 바꿈 추가
//        byte[] original = input.getBytes(); // [65][66][67] ...
//        // 배열 크기만 선언한 상태
//        byte[] encrypted = new byte[original.length]; // [65 + 3][66 + 3][67+ 3] ...
//
//        for (int i = 0; i < original.length; i++) {
//            encrypted[i] = (byte) (original[i] + Integer.parseInt(key));
//        }
//        fos.write(encrypted);
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }
//
//}
//
