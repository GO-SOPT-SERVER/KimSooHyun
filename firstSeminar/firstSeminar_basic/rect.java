package firstSeminar_basic;
//리스코프 치환원칙을 정리하기 위한 예제입니다. 둘의 공통점을 shape라는 인터페이스로 빼서 둘의 관계를 정리하여 의존성을 떨어뜨리는 것을 볼 수 있습니다.
//그 중 이 rect.java는 직사각형을 의미하는 클래스입니다.
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
