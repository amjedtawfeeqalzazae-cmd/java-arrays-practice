import java.util.Scanner;
public class Array2DProperties {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        int[][] array = new int[rows][rows];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i <rows;i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("elements of main diagonal : ");
        for (int i = 0; i < rows;i++){
             System.out.println(array[i][i]);
        }
        System.out.println("elements upper of main diagonal : ");
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i<j)
                    System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("elements lower of main diagonal : ");
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i>j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("element of secondary diagonal : ");
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i+j==rows-1){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("element upper of secondary diagonal : ");
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i+j<rows-1){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("element lower of secondary diagonal : ");
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i+j>rows-1){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i==j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("summation element of main diagonal = "+sum);
        sum=0;
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < rows; j++) {
                if (i+j==rows-1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("summation element of secondary diagonal = "+sum);

    }
}
