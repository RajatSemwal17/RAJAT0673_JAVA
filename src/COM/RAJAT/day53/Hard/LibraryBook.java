package COM.RAJAT.day53.Hard;

class Library{
    String title;
    String author;
    int pages;

    Library(){}

    Library(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }

    Library(Library other){
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
    }
    void display(){
        System.out.println("Title: " + title + "\nAuthor: "+ author + "\nPages: " + pages);
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Library l1 = new Library("RACHEL. NEUMEIER","The Floating Islands",250);
        Library l2 = new Library(l1);
        l2.display();
    }
}