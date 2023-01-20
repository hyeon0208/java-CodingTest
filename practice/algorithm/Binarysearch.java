package algorithm;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {10, 13, 17, 30, 41, 45};
        binarySearch(arr, 41);
    }

    public static int binarySearch(int arr[],  int findKey) {
        int low = 0;
        int high = arr.length - 1;

        // low가 high보다 작거나 같을 때 까지 반복.
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == findKey) {
                System.out.println(mid);
                return mid;
            }
            if (arr[mid] > findKey) {
                high = mid - 1;
            }
            if (arr[mid] < findKey) {
                low = mid + 1;
            }
        }
        // low > high 이라면 -1을 반환하고 종료.
        return -1;
    }
}
