package COM.RAJAT.day51;

public class Employee {
    String name;
    long id;
    String departments;
    public Employee(String n, long i, String d){
        name = n;
        id = i;
        departments = d;
    }
    public String toString(){
        return "NAME: " + name + " ID: " + id + " DEPARTMENT: " + departments + "\n";
    }

    public static void main(String[] args) {
        Employee emp = new Employee("RAJAT SEMWAL",2410990673L,"BE-CSE");
        System.out.println(emp.toString());
    }
}
