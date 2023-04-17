package firstSeminar_basic;
// rect.java 클래스입니다. 정사각형 클래스로 shape 인터페이스를 가지고와서 구현함으로써 리스코프 치환 원칙을 설명하기 좋은 예제입니다.
import firstSeminar_basic.shape;

public class rect implements shape {
    private int h;
    private int w;

    rect(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int getArea() {
        return h * w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }
}
