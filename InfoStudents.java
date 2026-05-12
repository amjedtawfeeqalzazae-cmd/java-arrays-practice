import java.util.Scanner;
public class InfoStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of students");
        int size = input.nextInt();
        String[] name = new String[size];
        int[] id = new int[size];
        float[] midD = new float[size];
        float[] finalD = new float[size];
        float[] total = new float[size];
        float max=0;
        int ch;
        do {
            System.out.println("1-enter data students");
            System.out.println("2-enter grade students of mid");
            System.out.println("3-enter grade students of final");
            System.out.println("4-display data students");
            System.out.println("5-display data student great of grade");
            System.out.println("6-who did students fail");
            System.out.println("7-order of students by greater than grade ");
            System.out.println("8-display data of students after add the grade ");
             ch = input.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < size; i++) {
                        System.out.println("enter student name");
                        name[i] = new Scanner(System.in).nextLine();
                        System.out.println("enter student id");
                        id[i] = new Scanner(System.in).nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < size; i++) {
                        System.out.println("enter student mid");
                        midD[i] = input.nextFloat();
                    }
                    break;
                case 3:
                    for (int i = 0; i < size; i++) {
                        System.out.println(" enter student final");
                        finalD[i] = input.nextFloat();
                        total[i] = finalD[i] + midD[i];
                    }
                    break;
                case 4:
                    System.out.println("number  name   mid   final   total");
                    for (int i = 0; i < size; i++) {
                        System.out.println("  " + (i + 1) + "    " + name[i] + "   " + midD[i] + "   " + finalD[i] + "   " + total[i]);
                    }
                    break;
                case 5:
                    int m = 0;
                    max = total[0];
                    for (int i = 1; i < size; i++)
                        if (total[i] > max) {
                            max = total[i];
                            m = i;
                        }
                    System.out.println(name[m] + "   " + midD[m] + "   " + finalD[m] + "   " + total[m]);
                    break;
                case 6:
                    for (int i = 0; i < size; i++) {
                        if (total[i] < 75)
                            System.out.println(name[i] + "  " + midD[i] + "  " + finalD[i] + "  " + total[i]);
                    }
                    break;
                case 7:
                    float temp;
                    float temp2;
                    float temp3;
                    String numee;
                    for (int i = 0; i < size; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (total[i] < total[j]) {

                                temp = total[i];
                                total[i] = total[j];
                                total[j] = temp;

                                temp2 = midD[i];
                                midD[i] = midD[j];
                                midD[j] = temp2;

                                temp3 = finalD[i];
                                finalD[i] = finalD[j];
                                finalD[j] = temp3;

                                numee = name[i];
                                name[i] = name[j];
                                name[j] = numee;
                            }
                        }
                    }
                    for (int i = 0; i < size; i++)
                        System.out.println("  " + (i + 1) + "    " + name[i] + "   " + midD[i] + "   " + finalD[i] + "   " + total[i]);
                    break;
                case 8:
                    float addedGrade = 150 - max;
                    System.out.println("number  name   mid   final   total");
                    for (int i = 0; i < size; i++) {
                        System.out.println("  " + (i + 1) + "    " + name[i] + "   " + midD[i] + "   " + finalD[i] + "   " + (total[i] + addedGrade));
                    }
                    break;
                default:
                    System.out.println("wrong choose!!");
            }
        }while (ch!=9);
    }
}
