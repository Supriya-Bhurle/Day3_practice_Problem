package Day3_Array;

public class PrintTheLargestElement {
    public static void main(String[] args) {
        int [] arr = new int []{29, 35, 80, 90, 60};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
