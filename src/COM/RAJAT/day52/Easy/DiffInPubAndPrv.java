package COM.RAJAT.day52.Easy;

class Student {
    String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for private field
    int getAge() {
        return age;
    }

    void displayInfo() {
        System.out.println(name + " - " + age);
    }
}

public class DiffInPubAndPrv {
    public static void main(String[] args) {
        Student s = new Student("RAJAT", 18);
        s.displayInfo();
        System.out.println(s.name);
//        System.out.println(s.age);
    }
}
