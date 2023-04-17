package firstSeminar_basic;
// 직사각형 클래스인 square.java입니다. shape 인터페이스를 구현함으로써 rect클래스가 수정이 되어도 영향을 받지 않도록 설계 된 것을 알 수 있었습니다.
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
