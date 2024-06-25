package ImportantPrograms;

public class ReverseString {

    public static void isReverseStringBuilder(String input){
        String reverse = new StringBuilder(input).reverse().toString();

        System.out.println("\n------Using String Builder------");
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reverse);
    }

    public static void isReverseForLoop(String input) {
        String reverse = "";
        for(int i=input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }

        System.out.println("\n------Using For Loop------");
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reverse);
    }



    public static void main(String[] args) {
        String input = "Hello, World!";
        isReverseStringBuilder(input);
        isReverseForLoop(input);
    }
}
