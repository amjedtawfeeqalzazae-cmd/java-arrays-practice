import java.util.Scanner;
public class NotRepeatElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            int x=0;
                    for(int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            x++;
                            break;
                        }
                    }
            if(x ==0){
               System.out.println(arr[i]);
            }
        }
    }
}

