package ImportantPrograms;

public class PalindromeString {

    public static void isPalindrome(String input){
        String rev = "";

        for (int i=input.length()-1; i>=0; i--){
            rev = rev+input.charAt(i);
        }

        if(rev.equals(input)){
            System.out.println(input + " is Palindrome");
        } else {
            System.out.println(input + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        String input = "12321";
        input = input.toLowerCase();
        isPalindrome(input);
    }
}
