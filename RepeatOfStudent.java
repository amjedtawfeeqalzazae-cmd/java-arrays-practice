import java.util.Scanner;

public class RepeatOfStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number names");
        int size = sc.nextInt();

        String[] names = new String[size];
        int[] counts = new int[size];
        System.out.println("Enter names ");
        for (int i = 0; i < size; i++)
            names[i] = sc.next();

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (names[i].equals(names[j]))
                    counts[i]++;

        System.out.println(" name    counter ");
        int count;
        for (int i = 0; i < size; i++) {
            count = 0;
            if (i == 0) {
                System.out.println(names[i] + "\t " + counts[i]);
            } else {
                for (int j = 0; j < i; j++) {
                    if (names[i].equals(names[j]))
                        count++;
                }
                if (count == 0) {
                    System.out.println(names[i] + " \t" + counts[i]);
                }
            }
        }
    }
}