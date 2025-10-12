package COM.RAJAT.day54.Medium;

class Rectangle{
    private int height;
    private int breadth;
    Rectangle(){};

    void setheight(int height){
        this.height = height;
    }

    void setBreadth(int breadth){
        this.breadth = breadth;
    }

    int getheight(){
        return height;
    }

    int getBreadth(){
        return breadth;
    }

    Rectangle(int w, int b){
        this.height = w;
        this.breadth = b;
    }

    Rectangle(Rectangle other){
        this.height = other.height;
        this.breadth = other.breadth;
    }

    void area(){
        System.out.println("Area of rectangle is: " + height*breadth);
    }
}
public class rect {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,5);
        Rectangle r1 = new Rectangle(r);

        r.setheight(100);
        r.area();
        r1.area();
    }
}
