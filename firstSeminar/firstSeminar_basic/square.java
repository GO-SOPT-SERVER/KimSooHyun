package firstSeminar_basic;
//정사각형을 담당하는 square.java클래스입니다. 공통점인 shape인터페이스를 받고있습니다.
public class square implements shape {
    private int h;
    private int w;

    square(int h){
        this.h = h;
        this.w = h;
    }
    public void setWH(int h){
        this.h=h;
        this.w=h;
    }
    @Override
    public int getArea(){
        return h*w;
    }
}
