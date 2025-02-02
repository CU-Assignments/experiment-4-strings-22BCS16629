import java.util.ArrayList;
import java.util.List;
public class PatternMatching {

    public static boolean matchesPattern(String query, String pattern) {
        int i = 0, j = 0;

        while (i < query.length() && j < pattern.length()) {
                        if (query.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            i++; 
                }
return j == pattern.length();
    }
    public static boolean[] camelMatch(String[] queries, String pattern) {
        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = matchesPattern(queries[i], pattern);
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        boolean[] result = camelMatch(queries, pattern);
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
