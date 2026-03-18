package ch17;

import java.io.*;

public class CharBufferedKeyboardConsoletest {
    public static void main(String[] args) throws IOException {

        /**
         * 스트림 체인 구조
         *
         * [키보드]
         *
         * InputStreamReader(브릿지)
         * BufferedRead (버퍼 + readLine() 추가)
         *
         * [프로그램] --> 콘솔
         * BufferedWriter (버퍼 + newLine() 추가)
         *  PrintWriter
         * System.out(PrintWriter) - 콘솔창에 출력
         *
         */

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        PrintWriter pw = new PrintWriter(System.out);
        BufferedWriter bw = new BufferedWriter(pw);

        String line;
        while ((line =br.readLine())  != null) {
            bw.write(line);
            bw.newLine();

            bw.flush();
        }


    }
}
