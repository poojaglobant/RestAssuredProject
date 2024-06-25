package ImportantPrograms;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void isAnagram(String input1, String input2){
        input1 = input1.replaceAll("\\s","");
        input2 = input2.replaceAll("\\s", "");

        if(input1.length() != input2.length()){
            System.out.println("Given Strings are not anagram");
        } else {
            char[] arr1 = input1.toLowerCase().toCharArray();
            char[] arr2 = input2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("Given String are anagram");
            } else {
                System.out.println("Given Strings are not anagram");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String input1 = scanner.nextLine();
        System.out.println("Enter second string : ");
        String input2 = scanner.nextLine();
        isAnagram(input1,input2);
        scanner.close();
    }
}
