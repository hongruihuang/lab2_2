import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @Description
 * Test class for Solution.largestNumber(int[] nums)
 *
 * Testing Principles:
 * - Equivalence Partitioning: Dividing inputs into classes that are expected to be treated similarly by the software.
 * - Boundary Value Analysis: Testing inputs at the boundaries of equivalence classes.
 * - Test cases include:
 *   - Empty array
 *   - Single element array
 *   - All zeros
 *   - Numbers with different lengths
 *   - Numbers requiring rearrangement for maximum value
 *   - Numbers that are already in the order for maximum value
 *   - Very large numbers to test computational limits
 */

class L2022212016_16_Test {

    /*
     * @Test Purpose: Verify behavior with an empty array.
     * Test Case: nums = []
     * Expected Result: An empty string
     */
    @Test
    public void testEmptyArray() {
        Solution16 solution = new Solution16();
        int[] nums = {};
        String expected = "";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify behavior with a single-element array.
     * Test Case: nums = [1]
     * Expected Result: "1"
     */
    @Test
    public void testSingleElement() {
        Solution16 solution = new Solution16();
        int[] nums = {1};
        String expected = "1";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify correct handling of arrays with all zeros.
     * Test Case: nums = [0, 0, 0]
     * Expected Result: "0"
     */
    @Test
    public void testAllZeros() {
        Solution16 solution = new Solution16();
        int[] nums = {0, 0, 0};
        String expected = "0";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify correct ordering with numbers of different lengths.
     * Test Case: nums = [3, 30, 34, 5, 9]
     * Expected Result: "9534330"
     */
    @Test
    public void testDifferentLengths() {
        Solution16 solution = new Solution16();
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify that rearrangement leads to the maximum value.
     * Test Case: nums = [10, 2]
     * Expected Result: "210"
     */
    @Test
    public void testRearrangementRequired() {
        Solution16 solution = new Solution16();
        int[] nums = {10, 2};
        String expected = "210";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify correct behavior when numbers are already in optimal order.
     * Test Case: nums = [9, 8, 7, 6]
     * Expected Result: "9876"
     */
    @Test
    public void testNoRearrangementNeeded() {
        Solution16 solution = new Solution16();
        int[] nums = {9, 8, 7, 6};
        String expected = "9876";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify handling of very large numbers.
     * Test Case: nums = [999999998, 999999997, 999999999]
     * Expected Result: "999999999999999998999999997"
     */
    @Test
    public void testVeryLargeNumbers() {
        Solution16 solution = new Solution16();
        int[] nums = {999999998, 999999997, 999999999};
        String expected = "999999999999999998999999997";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify correct ordering with numbers that could cause sorting issues.
     * Test Case: nums = [121, 12]
     * Expected Result: "12121"
     */
    @Test
    public void testPotentialSortingIssue() {
        Solution16 solution = new Solution16();
        int[] nums = {121, 12};
        String expected = "12121";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify handling of leading zeros in the output.
     * Test Case: nums = [0, 0, 1]
     * Expected Result: "100"
     */
    @Test
    public void testLeadingZeros() {
        Solution16 solution = new Solution16();
        int[] nums = {0, 0, 1};
        String expected = "100";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }

    /*
     * @Test Purpose: Verify correct ordering with numbers sharing the same prefix.
     * Test Case: nums = [824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247]
     * Expected Result: "9609938824824769735703560743981399"
     */
    @Test
    public void testSamePrefixNumbers() {
        Solution16 solution = new Solution16();
        int[] nums = {824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247};
        String expected = "9609938824824769735703560743981399";
        String result = solution.largestNumber(nums);
        assertEquals(expected, result);
    }
    // can add some error message for test
}
