import java.util.Scanner;
public class manghaichieuvacacsooduongcheochinh {
    public static void main(String[] args) {
    int n;
    int sum = 0;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập vào bậc của ma trận: ");
     n = scanner.nextInt();
     int T[][] = new int[n][n];
     System.out.println("Nhập các phần tử cho ma trận: ");
     for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
     System.out.print("T[" + i + "]["+ j + "] = ");
     T[i][j] = scanner.nextInt();
     }
}
     System.out.println("Ma trận T vừa nhập:");
     for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
     System.out.print(T[i][j] + "\t");
}
     System.out.println(" ");
}
      for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          if (i == j) {
              sum += T[i][j];
            }
     }
}
      System.out.println("Tổng các số ở đường chéo chính của ma trận vuông = " + sum);
    }
}
