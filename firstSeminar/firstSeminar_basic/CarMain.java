package firstSeminar_basic;
//오버로딩에 대해서 정리하는 예제입니다.
public class CarMain {
    public static void main(String [] args){
        Car martiz = new Car("d","k",3);
        Car blueCar = new Car(300,500);
        System.out.println(martiz.color+martiz.gearType+martiz.door);
        System.out.println(blueCar.color+blueCar.gearType+blueCar.door);
    }
}
