/**
 * Program to print a mirrored number pyramid using nested loops.
 * 
 * Pattern:
 *         1
 *       1 2 1
 *     1 2 3 2 1
 *   1 2 3 4 3 2 1
 * 1 2 3 4 5 4 3 2 1
 */
public class assignment02 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // STEP 1: Print leading spaces
            // Each level up from the bottom adds 2 spaces (to account for a number and a space)
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  ");
            }

            // STEP 2: Print ascending sequence (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                // Print a space after number if it's not the only number or if descending sequence follows
                if (i > 1) {
                    System.out.print(" ");
                }
            }

            // STEP 3: Print descending sequence (i-1 down to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
                // Print space between descending numbers
                if (j > 1) {
                    System.out.print(" ");
                }
            }

            // STEP 4: Move to the next line
            System.out.println();
        }
    }
}
