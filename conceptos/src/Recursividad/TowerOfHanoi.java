package Recursividad;

public class TowerOfHanoi {
    private int totalDisks;

    public TowerOfHanoi(int totalDisks) {
        this.totalDisks = totalDisks;
    }

    public void solve() {
        moveTower(totalDisks, 1, 3, 2);
    }

    public void moveTower(int numDisk, int start, int end, int temp) {
        if (numDisk == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numDisk - 1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisk - 1, temp, end, start);
        }
    }

    private void moveOneDisk(int start, int end) {
        System.out.println("Move one disk from " + start + " to " + end);
    }
}
