package Examples2;

public class binary_search {

    public static void main(String[] args) {
        int arr[] = {12, 10, 30, 50, 100};
        System.out.println(fun(arr, 5) + " ");
    }

    static int fun(int a[], int n) {
        int x;
        if (n == 1) {
            return a[0];
        } else {
            x = fun(a, n - 1);
        }
        if (x > a[n - 1]) {
            return x;
        } else {
            return a[n - 1];
        }
    }
}
