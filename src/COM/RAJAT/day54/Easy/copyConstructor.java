package COM.RAJAT.day54.Easy;

class Book{
    public StringBuilder title;
    public String author;
    Book(){}
    Book(String t){
        title = new StringBuilder(t);
    }
    Book(Book other){
        this.title = other.title;
        this.author = other.author;
    }
}
public class copyConstructor {
    public static void main(String[] args) {
        Book b = new Book("RAJAT");
        Book b2 = new Book(b);
        b2.title.append(" SEMWAL");

        System.out.println(b2.title);
        System.out.println(b.title);
    }
}
