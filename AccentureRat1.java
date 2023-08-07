
public class AccentureRat1 {

    static int ratFood(int arr[], int n, int r, int u) {
        int count = 0;
        int total = r * u;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (count < total) {
                temp++;
                count = count + arr[i];

            } else {
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 3, 5, 7, 4, 1, 2 };
        int n = 8;
        int r = 7;
        int u = 2;
        System.out.println(ratFood(arr, n, r, u));

    }

}
