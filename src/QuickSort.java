import java.util.Scanner;
//퀵정렬

public class QuickSort {
    //배열 요소 a[idx1]과 [idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //퀵정렬
    static void quicksort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr)/2];

        do {
            while (a[pl] < x) {
                pl++;
            }
            while (a[pr] > x) {
                pr--;
            }
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        if (left < pr) {
            quicksort(a, left, pr);
        }
        if (pl < right) {
            quicksort(a, pl, right);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        quicksort(x, 0, nx-1);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
