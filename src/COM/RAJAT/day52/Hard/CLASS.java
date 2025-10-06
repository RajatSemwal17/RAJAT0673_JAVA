package COM.RAJAT.day52.Hard;

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }
}

class School{
    public void printWithAnotherClass(Student s){
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}

public class CLASS {
    public static void main(String[] args) {
        Student s = new Student("RAJAT", 19);
        School c = new School();
        c.printWithAnotherClass(s);
        s.setAge(67);
        c.printWithAnotherClass(s);
    }
}
