import java.util.Scanner;

/**
 * Main class to demonstrate creating and using Lucas numbers.
 * <p>
 * The program:
 * <ul>
 *     <li>Reads an integer N from the user.</li>
 *     <li>Generates the first N Lucas numbers.</li>
 *     <li>Calculates their sum.</li>
 *     <li>Verifies the identity:
 *         L(0) + L(1) + ... + L(n-1) = L(n+1) - 1</li>
 * </ul>
 */
public class Main {
    /**
     * Entry point of the program.
     * <p>
     * Steps:
     * <ol>
     *     <li>Ask the user for the number of Lucas numbers to generate.</li>
     *     <li>Create an array of {@link LukeNumber} objects.</li>
     *     <li>Compute the sum of their values.</li>
     *     <li>Check if the sum matches the formula L(n+1) - 1.</li>
     *     <li>Print the result of the expression.</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N amount of numbers: ");
        int n = sc.nextInt();

        // Array of Lucas numbers
        LukeNumber[] arr = new LukeNumber[n];

        // Fill the array with Lucas numbers up to index n-1
        for (int i = 0; i < n; i++) {
            arr[i] = new LukeNumber(i);
        }

        // Calculate the sum of generated Lucas numbers
        int sum = 0;
        for (LukeNumber num : arr) {
            int idx = num.getIdx();
            int value = num.getValue();
            sum += value;
        }

        // Verify the identity: Sum(L(0..n-1)) = L(n+1) - 1
        boolean isEqual = (sum == new LukeNumber(n + 1).getValue() - 1);

        System.out.format("expression -- " +
                "Sum of Luke nums '%d' equals L(n+1)-1: " ,sum,isEqual);

        sc.close();
    }
}
