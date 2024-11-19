package Colecciones;

public class BingoBall {
    private int number;

    public BingoBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BingoBall bingoBall = (BingoBall) obj;
        return number == bingoBall.number;
    }

    @Override
    public String toString() {
        return "BingoBall{" + "number=" + number + '}';
    }
}
