package COM.RAJAT.day52.Easy;

class Car{
    public String make;
    public int year;
    Car(String m, int y){
        this.make = m;
        this.year = y;
    }
    void display(){
        System.out.println(make + " " + year);
    }
}
public class DefineAClass {
    public static void main(String[] args) {
        Car c = new Car("ABC" , 2006);
        c.display();
    }
}