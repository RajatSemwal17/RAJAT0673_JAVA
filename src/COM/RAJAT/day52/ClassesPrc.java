package COM.RAJAT.day52;

// File name: Main.java
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

public class ClassesPrc {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student("RS17", 20);
        s1.displayInfo();               // Access method inside Student
        System.out.println(s1.name);    // Public field
        System.out.println(s1.getAge()); // Private field accessed via getter
    }
}

