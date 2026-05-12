import java.util.Scanner;
public class Array2DMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows1 = input.nextInt();
        System.out.println("Enter the number of columns ");
        int columns1 = input.nextInt();
        System.out.println("Enter the number of rows ");
        int rows2 = input.nextInt();
        System.out.println("Enter the number of columns ");
        int columns2 = input.nextInt();
        int[][] array1 = new int[rows1][columns1];
        int[][] array2 = new int[rows2][columns2];
        int[][] array3 = new int[rows1][columns2];
        System.out.println("Enter the elements of the array1: ");
        for(int i = 0; i< rows1; i++)
            for(int j = 0; j< columns1; j++)
                array1[i][j]=input.nextInt();
        System.out.println("Enter the elements of the array2: ");
        for(int i = 0; i< rows2; i++)
            for(int j = 0; j< columns2; j++)
                array2[i][j] = input.nextInt();
        if (columns1==rows2) {
                for (int i = 0; i < rows1; i++)
                        for (int h = 0; h < columns2; h++) {
                            int sum = 0;
                            for (int j = 0; j < rows2; j++) {
                                sum += array1[i][j] * array2[j][h];
                            }
                            array3[i][h] = sum;
                        }
                for (int i = 0; i < rows1; i++) {
                    for (int j = 0; j < columns2; j++)
                        System.out.print(array3[i][j] + " ");

                    System.out.println();
                }
        }
        else
            System.out.println("we cannot make arrays of different length");
    }
}