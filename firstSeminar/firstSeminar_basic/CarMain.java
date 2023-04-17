package firstSeminar_basic;
//this와 this()를 실험하는 드라이버 클래스입니다.
public class CarMain {
    public static void main(String [] args){
        Car martiz = new Car("d","k",3);
        Car blueCar = new Car(300,500);
        System.out.println(martiz.color+martiz.gearType+martiz.door);
        System.out.println(blueCar.color+blueCar.gearType+blueCar.door);
    }
}
