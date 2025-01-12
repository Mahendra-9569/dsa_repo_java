package dsa_repo_java;

public class valid_parenthsis {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false; // A valid string must have an even length
        }

        // Left-to-right pass
        int balance = 0; // Tracks open parentheses
        int unlockedCount = 0; // Tracks unlocked positions
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                // Locked position
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }
            } else {
                // Unlocked position
                unlockedCount++;
            }

            // If too many `)` and unlocked cannot compensate
            if (balance + unlockedCount < 0) {
                return false;
            }
        }

        // Right-to-left pass
        balance = 0;
        unlockedCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                // Locked position
                if (s.charAt(i) == ')') {
                    balance++;
                } else {
                    balance--;
                }
            } else {
                // Unlocked position
                unlockedCount++;
            }

            // If too many `(` and unlocked cannot compensate
            if (balance + unlockedCount < 0) {
                return false;
            }
        }

        // If both passes succeed, the string can be valid
        return true;
    }
    public static void main(String[] args) {
        valid_parenthsis vp = new valid_parenthsis();
        String s = "(()))";
        String locked = "10000";
        System.out.println(vp.canBeValid(s, locked));
    }
    
}
