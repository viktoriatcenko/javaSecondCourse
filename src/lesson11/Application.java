package lesson11;

public class Application {
    public static void main(String[] args) {
        int f = findFactorial(5);
    }

    static int findFactorial(int x) { // y = 1 * ..... * x;
        if (x == 1) {
            return 1;
        }
        return x * findFactorial(x - 1);
    }
}
