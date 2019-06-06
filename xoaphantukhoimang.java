import java.util.Scanner;
public class xoaphantukhoimang {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int T[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            T[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên X: ");
        int X = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (T[i] != X) {
                T[c] = T[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + X + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(T[i] + "\t");
        }
    }
}
