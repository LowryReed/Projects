public class Towers {
    private int disks;

    public Towers(int numDisks) {
        disks = numDisks;
    }

    public void solve() {
        moveTower(disks, 'A', 'C', 'B');
    }

    private void moveTower(int numDisks, char fromPeg, char toPeg, char tempPeg) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
        } else {
            moveTower(numDisks - 1, fromPeg, tempPeg, toPeg);

            System.out.println("Move disk " + numDisks + " from " + fromPeg + " to " + toPeg);

            moveTower(numDisks - 1, tempPeg, toPeg, fromPeg);
        }
    }
}