package firstSeminar_basic;
// 리스코프 치환원칙을 설명하는 예제의 인터페이스 역할을 하는 shape인터페이스 입니다. getArea()라는 넓이를 구체적으로 재정의 안함으로서 squre와 rect를
// 연결해주고 있습니다.
public interface shape {
    public int getArea();
}
