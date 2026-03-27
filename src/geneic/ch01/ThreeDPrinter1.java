package geneic.ch01;

public class ThreeDPrinter1 {

    // 재료
    Plastic material;

    // 재료를 꺼냄
    public Plastic getMaterial() {
        return material;
    }


    // 재료를 넣음
    public void setMaterial(Plastic material) {
        this.material = material;

    }

    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        ThreeDPrinter1 threeDPrinter1 = new ThreeDPrinter1();

        threeDPrinter1.setMaterial(plastic);

        System.out.println(threeDPrinter1.getMaterial());
        //threedprint1.getmetartl() --> plastic의 주소값

    }
}
