public class NotFibonacci {
    public static void main(String args[]) {
        Long n = 100L;

        System.out.println("Printing first " + n + " terms of notFibonacci sequence:");
        notFib(n);
    }

    // https://www.guru99.com/fibonacci-series-java.html

    // n:        1   2   3   4   5   6   7
    // notFib:   0   1   2   7   20  61  182

    // Method for not fibonacci
    public static void notFib(Long n) {
        Long num1 = 0L;
        Long num2 = 1L;
        Long sum = 0L;

        if (n >= 1)
            System.out.println(0);
        if (n >= 2)
            System.out.println(1);

        int i = 3;
        while(i <= n) {
            sum = 3 * num1 + 2 * num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
