public class StringPrograms {
    
    // Each character in a new line
    public static void breakCharacters(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }

    // Reverse String 
    public static void printReverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    // Check string is palindrome or not
    public static boolean isPalindrom(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        if (str.equals(newStr)) return true;
        return false;
    }

    public static void countVowelConsonantSpaces(String str) {

        int vowel = 0, space = 0, consonant = 0;
        for (char c : str.toCharArray()) {
            
            switch(c) {
                case 'a','e','i','o','u' -> vowel++;
                case ' ' -> space++;
                default -> consonant++;
            }
        }
        System.out.println("spaces " + space + "\nconsonants " + consonant + "\nvowels " + vowel);

    }

    // toggle alphabet cases
    public static void toggleCase(String str) {
        String str2 = "";
        for (char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') str2 = str2 + (char)(c + 32);
            if(c >= 'a' && c <= 'z') str2 = str2 + (char)(c - 32);
            if(c == ' ') str2 = str2 + " ";
        }
        System.out.println(str2);
    }

    // Count strings with given prefix
    public static void countStrings(String[] strArr, String subStr) {
        int count = 0;
        int n = subStr.length();
        for (String string : strArr) {
            if(string.length() < n) continue;
            else {
                for (int i = 0; i < n; i++) {
                    if (string.charAt(i) == subStr.charAt(i)) count++;
                }
            }
        }
        System.out.println(count/2);
    }

    // capitalize each word and print in next line
    // public static void capitalizeWords(String str) {
    //     String st = "";
    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i) != ' ') st = st + str.charAt(i);
    //         else{
    //             String s = "";
    //             for (int j = 0; j < st.length(); j++) {
                    
    //                 if(st.charAt(0) >= 97) {
    //                     s = s + (char) (st.charAt(0) - 32);
    //                     continue;
    //                 }
    //                 s = s + st.charAt(i);
    //                 // System.out.println(s);
    //             }
    //             System.out.println(st);
    //             st = "";
    //             // System.out.println(s);
                
    //         }
    //     }
    // }










    public static void main(String[] args) {
        // toggleCase("popYYhai h");

        // String[] arr = {"pay", "attention", "paractice", "attend"};
        // countStrings(arr, "at");

        
    }
}
