public class StringConcatenationComparison {

    public static void main(String[] args) {
        int n = 100; // Number of concatenations

        // Using String (O(N²))
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a"; // Creates a new object every time (inefficient)
        }
        System.out.println("String Concatenation Done.");

        // Using StringBuilder (O(N))
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder Concatenation Done.");

        // Using StringBuffer (O(N))
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        System.out.println("StringBuffer Concatenation Done.");
    }
}
