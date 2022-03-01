package sk.fiit;

public class Usek {
    protected void countUsek(int number) {
        int i;
        for (i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }

    }
}
