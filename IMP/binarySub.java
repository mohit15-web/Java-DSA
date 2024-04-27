public class binarySub {

    public static int countExtraordinarySubstrings(String input_str) {
        int[] charMappings = createCharMappings();
        int count = 0;

        // Iterate through all substrings
        for (int i = 0; i < input_str.length(); i++) {
            for (int j = i; j < input_str.length(); j++) {
                String substring = input_str.substring(i, j + 1);
                if (isExtraordinary(substring, charMappings)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isExtraordinary(String str, int[] charMappings) {
        // Calculate the mapped sum of the substring
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += charMappings[c - 'a'];
        }

        // Check if the sum is divisible by the substring's length
        return sum % str.length() == 0;
    }

    // Function to create the charMappings array
    private static int[] createCharMappings() {
        int[] charMappings = new int[26];
        charMappings[0] = charMappings[1] = 1; // a, b
        charMappings[2] = charMappings[3] = charMappings[4] = 2; // c, d, e
        charMappings[5] = charMappings[6] = charMappings[7] = 3; // f, g, h
        // ... (Fill in the rest of the mappings)
        return charMappings;
    }

    public static void main(String[] args) {
        String input_str = "bdh";
        int count = countExtraordinarySubstrings(input_str);
        System.out.println("Number of extraordinary substrings: " + count);
    }
}