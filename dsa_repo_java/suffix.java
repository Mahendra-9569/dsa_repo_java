package dsa_repo_java;

public class suffix {
   
    

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        int n = str2.length();
        int m = str1.length();
        
        if (m > n) return false; // str1 cannot be both prefix and suffix if it is longer than str2
        
        // Check if str1 is a prefix of str2
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Not a prefix
            }
        }
        
        // Check if str1 is a suffix of str2
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(n - m + i)) {
                return false; // Not a suffix
            }
        }
        
        return true;
    }
    
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0; 
        int n = words.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Ensure i < j
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        
        
        String[] words = {"ab", "ac", "ad", "ae", "af", "ag"};
        suffix obj = new suffix();
        int result = obj.countPrefixSuffixPairs(words);
        System.out.println("Number of words that are both prefix and suffix: " + result);
    }
}

    
    

