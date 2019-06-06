import java.util.Scanner;
public class ptulonnhattrongmanghaichieu {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        b = scanner.nextInt();
        int T[][] = new int[a][b];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
        System.out.print("T[" + i + "]["+ j + "] = ");
         T[i][j] = scanner.nextInt();
     }
}
        int max = T[0][0];
        for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
        if (max < T[i][j]) {
            max = T[i][j];
                }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
            }
        }
    }
}
