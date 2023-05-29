package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και μέγιστο στοιχείο ενός πίνακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int arr[] = {30, 12, 80, 7, 15};
        int arr2[] = {30, 12, 80, 7, 15};


        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minPosition = i;
            }
        }

        for (int i = 1; i < arr2.length; i++){
            if (arr2[i] > maxValue){
                maxValue = arr2[i];
                maxPosition = i;
            }
        }

        System.out.printf("Min value is %d in position %d of the array\n", minValue, minPosition +1);
        System.out.printf("Max value is %d in position %d of the array", maxValue, maxPosition +1);
    }
}
