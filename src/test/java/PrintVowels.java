package ImportantPrograms;

public class PrintVowels {

    public static void frequecyOfVowels(String input){
        input = input.toLowerCase();
        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            int freq = 0;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                for (int j=0; j<input.length(); j++){
                    if(ch == input.charAt(j))
                        freq++;
                }
                System.out.println( "Frequency of '" + ch + "' --> " + freq);
            }
        }
    }

    public static void main(String[] args) {
        frequecyOfVowels("PoojaMeghRAjSharmaIsCute");
    }
}
