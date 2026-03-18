package ch17;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) {
        // abc.png 파일을 읽어서
        // abc2.png 파일을 만들어 보세요 ( 복사 가능)

        String sourceFile = "abc.png";
        String destFile = "abc3.png";

        long startTime = System.currentTimeMillis();

        try
            ( FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile)){

                int data;
                while (( data = fis.read()) != -1){
                    fos.write(data);

                }
                long endTime = System.currentTimeMillis();
                System.out.println("파일 복사 완료");
                System.out.println("소요 시간 : " + (endTime - startTime) + "ms");

            } catch(Exception e){
                throw new RuntimeException(e);

            }


        }
    }
