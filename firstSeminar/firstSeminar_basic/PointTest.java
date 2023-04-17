package firstSeminar_basic;

/*
super()를 다루는 예제입니다.
 */
public class PointTest {
    public static void main(String[] args){
        Point3D p3 = new Point3D(1,3,2);
    }

}
class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x :"+x+", y :"+y;
    }

}
class Point3D extends Point{
    int z;
    Point3D(int x, int y, int z){
        super(x,y); //여기 위치에 super(x,y)를 넣지 않으면 에러발생.
        this.x=x;
        this.y=y;
        this.z=z;
    }
    String getLocation(){
        return "X :"+ x+ ", y:"+y+ ", z :"+z;
    }
}
