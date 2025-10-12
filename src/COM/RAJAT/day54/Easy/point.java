package COM.RAJAT.day54.Easy;

class Point1{
    public int x;
    public int y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point1(Point1 p){
        this.x = p.x;
        this.y = p.y;
    }
}

public class point {
    public static void main(String[] args) {
        Point1 p = new Point1(3, 5);
        Point1 p2 = new Point1(p);
        System.out.println(p2.x + " " + p2.y);
    }
}

