public class CommonSubstring {

    // Somewhat inspired by https://www.youtube.com/watch?v=UZRkpGk943Q

    // Main Method to run program
    public static void main(String args[]) {

        // Initialize character arrays (spaces count as characters and is case sensitive)
        char[] s1 = {'g', 'e', 'a', 'r', 's', ' ', 'o', 'f', ' ', 'w', 'a', 'r'};
        char[] s2 = {'h', 'i', 's', 't' , 'o', 'r', 'y', ' ', 'o', 'f', ' ', 'w', 'a', 'r', 'r', 'i', 'o', 'r', 's'};

        char[] longestCommonSubsequence = LCSubstring(s1, s2);

        System.out.println("Character arrays to compare:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("The longest common substring is: ");
        System.out.print(longestCommonSubsequence);
    }

    // Method to return longest common substring
    public static char[] LCSubstring(char[] s1, char[] s2) {
        int[][] lenMatrix = new int[s1.length][s2.length];
        int largestCol = 0;
        int largestDiagonal = 0;

        // Find length of longest substring
        for (int row = 0; row < s1.length; row++) {
            for (int col = 0; col < s2.length; col++) {
                if(s1[row] == s2[col]) {
                    // Look at diagonal direction
                    lenMatrix[row][col] = 1;

                    // Add diagonal values not outside of matrix bounds
                    if (row-1 >= 0 && col-1 >= 0)
                        lenMatrix[row][col] = lenMatrix[row][col] + lenMatrix[row-1][col-1];

                    // Find largest diagonal
                    if (lenMatrix[row][col] > largestDiagonal) {
                        largestDiagonal = lenMatrix[row][col];
                        largestCol = col;
                    }
                }
            }
        }

        // Traverse backwards to find substring by counting columns backwards
        // will not access out of bounds indices of s2 b/c, the largest col <= length of smallest char[] input
        char[] subString = new char[largestDiagonal];
        for (int i = 0; i <= largestDiagonal-1; i++)
            subString[largestDiagonal-1-i] = s2[largestCol - i];


        return subString;
    }
}

