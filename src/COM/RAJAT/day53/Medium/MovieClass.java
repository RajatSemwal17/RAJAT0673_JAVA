package COM.RAJAT.day53.Medium;

class Movie{
    public String name;
    public int age;
    String religion;

    Movie(){}
    Movie(String n){
        this.name = name;
    }
    Movie(String n, int age){
        this.name = name;
        this.age = age;
    }
}
public class MovieClass {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("RAJAT");
        Movie m3 = new Movie("RISHABH",19);
    }
}
