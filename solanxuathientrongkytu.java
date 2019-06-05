import java.util.Scanner;
public class solanxuathientrongkytu {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào một chuỗi:");
    String Chuoi = scanner.nextLine();
    System.out.println("Nhập vào một chữ:");
    char text = scanner.next().charAt(0);
    System.out.print("Ký tự " + text + " xuất hiện " + solanxuạhien(Chuoi, text) + " lần");
    }

    public static int solanxuạhien(String tr, char ch) {
    int count = 0;
    for (int i = 0; i < tr.length(); i++) {
    if (ch == tr.charAt(i)) {
    count++;
            }
        }
    return count;
    }
}

