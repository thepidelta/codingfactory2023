package gr.aueb.cf.ch6;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];//0, 0, 0, 0

        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for (int item : arr1){
            System.out.print(item + " ");
        }
    }
}
