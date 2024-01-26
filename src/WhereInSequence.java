public class WhereInSequence {
    public static void main(String args[]) {
        Long Fn = 1640L;
        int index = whereInSequence(Fn);

        System.out.println("The position of the closest lower notFibonaaci number:");
        System.out.println("Input: " + Fn);
        System.out.println("Output: " + index);
    }


    // n:        1   2   3   4   5   6   7
    // notFib:   0   1   2   7   20  61  182

    // Find index of nearest notFibonacci number in sequence
    public static int whereInSequence(Long Fn) {
        Long num1 = 0L;
        Long num2 = 1L;
        Long sum = 0L;

        if (Fn <= 0)
            return 1;
        if (Fn == 1)
            return 2;

        int i = 3;
        while(i <= Fn) {
            sum = 3 * num1 + 2 * num2;
            if (sum > Fn) {
                return i-1;
            };
            num1 = num2;
            num2 = sum;
            i++;
        }

        return -1;
    }
}
