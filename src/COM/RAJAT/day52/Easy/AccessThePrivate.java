package COM.RAJAT.day52.Easy;

class Person{
    public String name;
    private String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    String add(){
        return address;
    }
    public void display(){
        System.out.println(name + " " + address);
    }
}
public class AccessThePrivate {
    public static void main(String[] args) {
        Person p = new Person("RAJAT","369 VPO BEHLANA");
        System.out.println(p.name);
        System.out.println(p.add());
    }
}
