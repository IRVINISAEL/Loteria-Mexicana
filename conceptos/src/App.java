public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Coin coin = new Coin();
        System.out.println(coin);

        // Variables Primitiva
        System.out.println("****Variables Primitivas *****");
        int num1 = 5;
        int num2 = 12;

        num2 = num1;

        num1 = 10;

        System.out.println("valor de num1:" + num1);
        System.out.println("valor de num2:" + num2);

        // Variables de objeto
        System.out.println("****Variables Objeto *****");

        Numero n1 = new Numero();
        n1.numero = 5;

        Numero n2 = new Numero();
        n2.numero = 12;

        n2 = n1;

        n1.numero = 10;

        System.out.println("valor de objeto n1:" + n1.numero);
        System.out.println("valor de objeto n2:" + n2.numero);

        // Estaticas
        Estaticas e1 = new Estaticas();
        e1.count = 5;

        System.out.println("valor del objeto e1.count:" + e1.count);
        e1.count = 100;
        System.out.println("valor del objeto e1.count:" + e1.count);
        e1.contarnormal(20);
        System.out.println("valor del objeto e1.count:" + e1.count);

        Estaticas.count2 = 100;
        System.out.println("valor del count2:" + Estaticas.count2);
        Estaticas.contarEstatico(120);
        System.out.println("valor del count2:" + Estaticas.count2);
        Estaticas.contarEstatico(5);
        System.out.println("valor del count2:" + Estaticas.count2);

    }
}
