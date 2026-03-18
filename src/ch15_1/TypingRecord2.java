//package ch15_1;
//
//import java.io.FileInputStream;
//
//public class TypingRecord2 {
//
//
//    public static void readCode() {
//
//        try (FileInputStream fin = new FileInputStream("typing_record_upgrade")) {
//            int data;
//            int lineNumber = 1;
//            StringBuilder sb = new StringBuilder();
//            // StringBuilder: 문자를 하나씩 이어 붙이는 가변 문자열 버퍼
//            // String += "가" 를 반복하면 매번 새로운 객체가 생겨 느리므로 StringBuilder 사용한다.
//
//            while ((data = fin.read()) != -1) {
//                System.out.println((char) data);
//                if (( char))data == '\n'){
//
//                    lineNumber++;
//
//                } else{
//                    System.out.println(sb.toString());
//                    Systemoo.append()
//                }
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
