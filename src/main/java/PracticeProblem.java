public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String word) {
    String clean = word.replace(" ", "").toLowerCase();
    int left = 0;
    int right = clean.length() - 1;

    while (left < right) {
        if (clean.charAt(left) != clean.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

	public static int getAge(String[] names, int[] ages, String name) {
    for (int i = 0; i < names.length; i++) {
        
        if (names[i].equalsIgnoreCase(name)) {
            return ages[i];
        }
    }
    
    
    return -1; 
}

	public static int countWords(String text, char target) {
    
    String[] words = text.split(" ");
    int count = 0;

    
    for (String word : words) {
        
        if (word.contains(String.valueOf(target))) {
            count++;
        }
    }

    return count;
}

}
