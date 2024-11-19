package Herencia;

public class Book {
    protected int numPages;

    public Book(int numPages){
        this.numPages=numPages;
    }

    protected void pages (){
        System.out.println("num of pages: "+ numPages);
    }
}
