package dsa_repo_java;

public class minimum_length {
    public int minimumLength(String s) {
        int[] charFrequency = new int[26];
        int totalLength = 0;
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }
        for (int frequency : charFrequency) {
            if (frequency == 0) continue;
            if (frequency % 2 == 0) {
                totalLength += 2;
            } else {
                totalLength += 1;
            }
        }
        return totalLength;
    }
    public static void main(String[] args) {
        minimum_length ml = new minimum_length();
        String s = "aaabbbccc";
        System.out.println(ml.minimumLength(s));
        
    }
    
}

