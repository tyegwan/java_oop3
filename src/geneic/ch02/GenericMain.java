package geneic.ch02;

import geneic.ch01.Plastic;
import geneic.ch01.Powder;
import http.api.Weathers;

import java.util.ArrayList;

public class GenericMain {

    public static void main(String[] args) {
        // 재네릭 프로그래밍을 활용하면 타입에 안정성을 줘서 컴파일 시
        //명확하게 타입을 지정할 수 있다

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();
        Water water1 = new Water();

        ArrayList<Integer> integers;
        //사용하는 시점에서 무엇을 넣을지 미리 지정해 주어야 한다.
        GenericPrinter<Plastic> genericPrinter = new GenericPrinter();
        //컴파일 시점에 플라스틱을 넣기로 했는데 다른 타입이 들어가면 컴파일 오류가 발생한다.
        //genericPrinter.setMeterial(powder1);
        genericPrinter.setMaterial(plastic1);
        Plastic temPlastic = genericPrinter.getMaterial();
        // 컴파일 시점에 역시 타입을 확인 할 수 있고 추가로 다운캐스팅 작업도 필요가 없다.
       // Powder tempPlastic = genericPrinter.getMaterial();


        System.out.println("--------------------");

        // 재료형 매개변수는 무엇이든 다 담을 수 있지만 이 또한 단점들이 발생 할 수 있다.
        GenericPrinter<Water> waterGenericPrinter = new GenericPrinter<>();
        waterGenericPrinter.setMaterial(water1);
        System.out.println(waterGenericPrinter.getMaterial());

    }
}
