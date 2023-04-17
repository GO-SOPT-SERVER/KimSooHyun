package firstSeminar_basic;
// this와 this()의 차이점에 대한 예제 코드입니다.
public class Car {
    String color;
    String gearType;
    int door;
    int price;
    int doorPrice;

    Car(String a,String b, int door){
        this.color = a;
        this.gearType=b;
        this.door=door;
    }
    Car(int a, int b){
        this("안녕안녕","모닝스터디",4);
        this.price = a;
        this.doorPrice=b;
    }
}
