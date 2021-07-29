import java.util.Scanner;
// 셸 정렬(버전1)

public class ShellSort {
    static void shellSort(int[] a, int n) {
        for (int h = n/2; h > 0; h/=2) {
            for (int i = h; i<n; i++) {
                int j;
                int tmp = a[i];
                for (j = i -h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전1)");
    }
}
