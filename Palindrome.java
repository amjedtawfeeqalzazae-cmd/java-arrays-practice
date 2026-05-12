import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("enter elements of array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int a = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == arr[j][i])
                    a++;
            }
        }
        if (a == (size * size)) System.out.println("array is palindrome");
        else System.out.println("array is not palindrome");
    }
}