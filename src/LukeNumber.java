/**
 * Class representing a Lucas number.
 * <p>
 * A Lucas number is defined similarly to a Fibonacci number, but starts with:
 * <ul>
 *     <li>L(0) = 2</li>
 *     <li>L(1) = 1</li>
 * </ul>
 * and satisfies the recurrence relation:
 * <pre>
 *     L(n) = L(n-1) + L(n-2) for n >= 2
 * </pre>
 * This class stores both the index and the computed value.
 */
public class LukeNumber {
    /**
     * Index of the Lucas number (n).
     */
    private final int idx;

    /**
     * Value of the Lucas number at this index (L(n)).
     */
    private final int value;

    /**
     * Constructs a Lucas number for a given index.
     *
     * @param idx the index of the Lucas number (n)
     */
    public LukeNumber(int idx) {
        this.idx = idx;
        this.value = calculateValue(idx);
    }

    /**
     * Calculates the Lucas number for a given index using an iterative approach.
     * <p>
     * Formula:
     * <ul>
     *     <li>L(0) = 2</li>
     *     <li>L(1) = 1</li>
     *     <li>L(n) = L(n-1) + L(n-2), for n ≥ 2</li>
     * </ul>
     *
     * @param idx the index of the Lucas number
     * @return the value of the Lucas number at that index
     */
    private int calculateValue(int idx) {
        if (idx == 0) return 2;
        if (idx == 1) return 1;

        int a = 2, b = 1, c = 0;
        for (int i = 2; i <= idx; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * Returns the value of the Lucas number.
     *
     * @return value of the Lucas number (L(n))
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the index of the Lucas number.
     *
     * @return index of the Lucas number (n)
     */
    public int getIdx() {
        return idx;
    }
}
