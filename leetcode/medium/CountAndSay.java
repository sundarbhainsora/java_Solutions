
/**
 * leetcode problem 38 Count And Say
 * Created by SundarBhainsora
 */
class Solution {
    public String countAndSay(int n) {
           if (n == 1) {
            return "1";
        }
        
        String result = "1"; // Starting point for countAndSay(1)
        
        for (int i = 2; i <= n; i++) {
            StringBuilder nextResult = new StringBuilder();
            char currentChar = result.charAt(0);
            int count = 0;

            // Iterate through the current result to build the next result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    count++;
                } else {
                    // Append the count and the character to the next result
                    nextResult.append(count).append(currentChar);
                    // Update currentChar and reset count
                    currentChar = result.charAt(j);
                    count = 1;
                }
            }
            // Append the last counted character
            nextResult.append(count).append(currentChar);
            result = nextResult.toString(); // Update result for the next iteration
        }
        
        return result;
    }
}