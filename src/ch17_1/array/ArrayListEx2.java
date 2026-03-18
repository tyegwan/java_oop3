package ch17_1.array;

import java.util.ArrayList;

public class ArrayListEx2 {

    public static void main(String[] args) {
        // 정수, 실수, 불리언, 사용자 정의 객체를 담을 수 있는 ArrayList 각각 만들어서 사용해 보기
        // 사용방법 스스로 익혀보기
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();




        list.add(1);
        books.add(new Book("책 먹는 여우"));





    }
}

class Book {
    String title;
    public Book(String name){
        title = name;
    }

}
