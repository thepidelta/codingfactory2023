package gr.aueb.cf.ch6;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα
 */
public class SecretArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);
    }

    /**
     * Επιστρέφει το Index του στοιχείου που αναζητά ή -1 αν δεν το βρει
     * @param arr input array
     * @param value the value that we are searching for
     * @return index if found, -1 if not found
     */
    public static int getElementPosition(int[] arr, int value){
        if (arr == null) return -1;
        int position = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                position = i;
                break;
            }
        }
        return position;
    }
}
