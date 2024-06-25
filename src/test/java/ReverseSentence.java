package ImportantPrograms;

import java.util.Arrays;

public class ReverseSentence {

    public static void revSentenceUsingArray(String input){
        String[] inputArr = input.split(" ");
        String[] outputArr = new String[inputArr.length];

        int outputIndex=0;
        for (int inputIndex=inputArr.length-1; inputIndex>=0; inputIndex--){
            outputArr[outputIndex] = inputArr[inputIndex];
            outputIndex++;
        }

        String output = Arrays.toString(outputArr).replace("[","").replace(",","").replace("]","");
        System.out.println("\n----------Using Array----------");
        System.out.println("Input String : " + input);
        System.out.println("Reversed String : " + output);
    }

    public static void revSentenceUsingStringBuilder(String input){
        String[] inputArr = input.split(" ");
        StringBuilder output = new StringBuilder();

        for(int i=inputArr.length-1; i>=0; i--){
            output.append(inputArr[i]);
             if(i!=0){
                 output.append(" ");
             }
        }

        String outputStr = output.toString();
        System.out.println("\n------Using String Builder------");
        System.out.println("Input String : " + input);
        System.out.println("Reversed String : " + outputStr);
    }

    public static void main(String[] args) {
        String input = "My name is Pooja";
        revSentenceUsingArray(input);
        revSentenceUsingStringBuilder(input);
    }
}
