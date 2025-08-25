package static2.ex;

public class Car {

    public String name;
    public static int count;

    Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름 : " + name);
        count++;
    }

    public static void showTatoalCars() {
        System.out.println("구매한 차량 수 : " + Car.count);
    }
}
