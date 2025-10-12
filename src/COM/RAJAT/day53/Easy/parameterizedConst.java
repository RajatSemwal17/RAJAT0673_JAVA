package COM.RAJAT.day53.Easy;

class Dog{
    public String name;
    public int age;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class parameterizedConst {
    public static void main(String[] args) {
        Dog d1 = new Dog("FGHJKL",19);
        Dog d2 = new Dog("FBHJH",20);
        System.out.println(d1.name + " " + d1.age + " "+ d2.name + " "+ d2.age);
    }
}
