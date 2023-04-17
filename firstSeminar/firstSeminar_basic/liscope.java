package firstSeminar_basic;
//liscope 원칙이 무엇인지 알아보는 예제입니다. 현재 클래스는 드라이버 클래스입니다.

public class liscope {
    public static void main(String[] args){
        square sq = new square(5);
        System.out.println(sq.getArea());
    }
}
