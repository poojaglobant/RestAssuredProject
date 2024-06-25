import io.restassured.path.json.JsonPath;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        String input = "This is testing";
        char[] inputArr = input.toCharArray();
        int[] freqArr = new int[input.length()];

      //  HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i< input.length(); i++){

            freqArr[i] =1;
            for (int j=i+1; j< input.length(); j++){
                if(inputArr[i] == inputArr[j]){
                    freqArr[i]++;
                    inputArr[j] = '0';
                }
            }

        }

        System.out.println("Frequencies of alphabets : ");
        for (int i=0; i<freqArr.length; i++){
            if(inputArr[i] != ' ' && inputArr[i] !='0'){
                System.out.println(inputArr[i] + " - " + freqArr[i]);
            }
        }
    }


    public void Demo2(){
        class A {

            public void display(){

                System.out.println("Class A Display");

            }

        }


        class B extends A {

            public void display(){
                System.out.println(“Class B Display”);
            }

        }


        class DriverDemo{

            public static void main(String[] args){

                A obj = new B();
                obj.display();
            }
        }
    }

}
