public class CommonSubsequence {

    // https://www.youtube.com/watch?v=ASoaQq66foQ

    // Main Method to run program
    public static void main(String args[]) {
        char[] s1 = {'a', 'l', 'm', 'a', 'n', 'a', 'c', 's'};
        char[] s2 = {'a', 'l', 'b', 'a', 't', 'r', 'o', 's', 's'};
        int longestCommonSubsequence = LCSequence(s1, s2);

        System.out.println("Character arrays to compare:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("The longest common subsequence is " + longestCommonSubsequence);
    }

    // Wrapper method so user does not have to enter additional arguments for parameters that are only used for recursive calls
    public static int LCSequence(char[] s1, char[]s2) {
        return LCSequence(s1, s2, s1.length, s2.length);
    }

    // Method to find longest common subsequence of two strings with all required parameters for recursion
    private static int LCSequence(char[] s1, char[] s2, int s1Len, int s2Len) {
        if ( s1Len == 0 || s2Len == 0)
            return 0;
        else if (s1[s1Len-1] == s2[s2Len-1])
            return 1 + LCSequence(s1, s2, s1Len-1, s2Len-1);

        return Math.max(LCSequence(s1, s2, s1Len-1, s2Len), LCSequence(s1, s2, s1Len, s2Len-1));
    }
}