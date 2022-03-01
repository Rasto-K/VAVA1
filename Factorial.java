package sk.fiit;

public class Factorial {

    private int countFactorial(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    protected void nthFactorial(int count) {
        for (int i = 1; i < count; i++) {
            System.out.print(countFactorial(i) + " ");
        }
    }

}
