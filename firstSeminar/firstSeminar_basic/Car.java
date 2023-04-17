package firstSeminar_basic;
//오버로딩에 대해서 공부하기 위해 두개의 매개변수의 개수가 다른 생성자를 작성했습니다.
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
