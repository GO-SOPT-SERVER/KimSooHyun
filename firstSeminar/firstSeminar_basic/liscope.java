package firstSeminar_basic;
// 리스코프 치환 원칙의 예제인 직사각형과 정사각형 문제입니다.
// square.java -> 직사각형 클래스 , rest.java -> 정사각형 클래스
// 그런데 정사각형 is 직사각형 관계이지만, 정사각형은 길이 하나만 바뀌면 모두 같이 변해야하는데 직사각형은 왼쪽 오른쪽을 별개로 움직일 수 있습니다.
// 즉, 정사각형은 직사각형인데 정사각형이 가지고 있지 않아도 되는 것을 구현해야하는 상황이 옵니다. 그래서 공통부분을 인터페이스 shape로 뽑아서 정리하는 예제입니다.

public class liscope {
    public static void main(String[] args){
        square sq = new square(5);
        System.out.println(sq.getArea());
    }
}
