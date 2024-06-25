public class MostFrequencyNumber {

    public static void maxFreqNum(int[] arr, int n){

        int maxCount = 0;
        int maxFreqNum = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for (int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                maxFreqNum = arr[i];
            }
        }

        System.out.println("Maximum frequency number is " + maxFreqNum + " with the frequency of " + maxCount);
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        int n = arr.length;

        maxFreqNum(arr,n);
    }
}
