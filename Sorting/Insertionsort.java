public class Insertionsort {
    public static void insertionsort(int arr[]) {
        int i, j, key;

        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 3, 6, 4, 1 };
        int n = arr.length;
        insertionsort(arr);
        for (int x : arr) {

            System.out.print(x + " ");
        }
    }
}
