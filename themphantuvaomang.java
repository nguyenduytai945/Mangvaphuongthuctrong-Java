import java.util.Scanner;
public class themphantuvaomang {
    public static void main(String[] args) {
        int[] array= {4, 7, 5, 6, 2, 4, 1};

        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập số cần chèn vào mảng: number = ");
        int number = input.nextInt();
        System.out.print("Nhập vị trí cần chèn vào mảng: index = ");
        int index = input.nextInt();
        array[index] = number ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
