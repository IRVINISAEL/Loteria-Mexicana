public class Estaticas {
    public int count = 0;
    public static int count2 = 0;

    public void contarnormal(int a) {
        count = count + a;
    }

    public static void contarEstatico(int a) {
        count2 = count2 + a;
    }

    public void contarVariableEstatica(int a) {
        count2 = count2 + a;
    }
}

