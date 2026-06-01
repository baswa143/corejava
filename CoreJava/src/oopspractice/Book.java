package oopspractice;

public class Book {
    String name;
    Book(String name){
        this.name = name;
    }
}
class Library{
    Book book;    //Aggregation HAS-A
    Library(Book book){
        this.book = book;
    }
    void display(){
        System.out.println(book.name);
    }
}

class Main4{
    public static void main(String[] args) {
        Book b=new Book("book");
        Library l=new Library(b);
        l.display();
        Library l1=new Library(new Book("library"));
        l1.display();

    }
}
