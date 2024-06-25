import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {

        String input = "Pooja";

        char[] tempArr = input.toCharArray(); // P o o j a

       input= input.toLowerCase();

        char[] inputArr = input.toCharArray(); // p o o j a

        Arrays.sort(inputArr);

        String ouput = new String(inputArr);

        char[] outputArr = ouput.toCharArray(); // a j o o p

        System.out.println("Sorted String is : " + ouput);


    }
}
