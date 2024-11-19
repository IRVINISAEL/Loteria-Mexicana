package Herencia;

public class Dictionary extends Book {
    private int numDefs;

    public Dictionary(int numDefs, int numPages) {
        super(numPages); // contructor de book
        this.numDefs = numDefs;
    }

    public void info() {
        System.out.println("Number of definition: " + numDefs);
        System.out.println("Definition per pages: " + numDefs / numPages);
    }

}

