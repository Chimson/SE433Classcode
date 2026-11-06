package classcode;

public class TextCompressor {
    /**
     * Compresses consecutive identical characters only if they repeat
     * at least `threshold` times (threshold must be between 2 and 5).
     *
     * Example with threshold=3: "aaabbc" -> "a3bbc"
     *
     * @param text      Input string (length 0 to 10 characters, letters only).
     * @param threshold Minimum run length to compress (2 to 5).
     * @return Compressed string.
     * @throws IllegalArgumentException if text is null, length > 10, contains non-letters,
     *                                  or threshold is outside [2, 5].
     */
    public static String compressRuns(String text, int threshold) {
        if (text == null || text.length() > 10 || threshold < 2 || threshold > 5) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }

        StringBuilder result = new StringBuilder();
        int n = text.length();
        int i = 0;

        while (i < n) {
            char c = text.charAt(i);
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Only letters allowed.");
            }

            int count = 1;
            while (i + 1 < n && text.charAt(i + 1) == c) {
                count++;
                i++;
            }

            // BUG: Using '>' instead of '>=' causes exact-threshold runs to bypass compression
            if (count > threshold) {
                result.append(c).append(count);
            } else {
                for (int k = 0; k < count; k++) {
                    result.append(c);
                }
            }
            i++;
        }

        return result.toString();
    }

		public static void main(String[] args) {

			// Example 1: Run meets threshold + single trailing character
      // "aaaa" (count 4 > threshold 3) -> "a4", "b" (count 1 <= 3) -> "b"
      System.out.println(TextCompressor.compressRuns("aaaab", 3));
      // Returns: "a4b"

      // Example 2: Run length is strictly less than threshold
      // "aa" (count 2 <= threshold 4) -> "aa", "bbb" (count 3 <= threshold 4) -> "bbb"
      System.out.println(TextCompressor.compressRuns("aabbb", 4));
      // Returns: "aabbb"

      // Example 3: Multiple distinct runs that both strictly exceed the threshold
      // "cccc" (count 4 > threshold 2) -> "c4", "dddd" (count 4 > threshold 2) -> "d4"
      System.out.println(TextCompressor.compressRuns("ccccdddd", 2));
      // Returns: "c4d4"

		}

}