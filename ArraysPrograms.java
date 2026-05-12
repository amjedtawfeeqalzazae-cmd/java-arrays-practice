import java.util.Scanner;
public class ArraysPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Choice1;
        do{
            System.out.println("choose one of the following options:");
            System.out.println("1_Programs of array 1D");
            System.out.println("2_Programs of array 2D");
            System.out.println("3_Exit the program ");
            Choice1 = input.nextInt();
            switch(Choice1){
                case 1:
                    System.out.println("Enter size of array");
                    int size = input.nextInt();
                    int[] array = new int[size];
                    boolean flag = false,stat=false;
                    int choice2;
                    do {
                        System.out.println("choose one of the following options:");
                        System.out.println("1_Enter elements of array");
                        System.out.println("2_Display elements of array");
                        System.out.println("3_Ordering elements of array");
                        System.out.println("4_Print Maximum element of array");
                        System.out.println("5_Search a number within array");
                        System.out.println("6_Exit the program ");
                        choice2 = input.nextInt();
                        switch (choice2) {
                            case 1:
                                for (int i = 0; i < size; i++) {
                                    System.out.println("Enter element " + (i + 1));
                                    array[i] = input.nextInt();
                                }
                                flag = true;
                            break;
                            case 2:
                                if (flag)
                                    for (int i = 0; i < size; i++)
                                        System.out.println(array[i]);
                                else
                                    System.out.println("Sorry,not exist any element");
                            break;
                            case 3:
                                if (flag) {

                                    int temp;
                                    System.out.println("What is type of ordering :");
                                    System.out.println("1_Ascending order");//تصاعدي
                                    System.out.println("2_Descending order");
                                    int order = input.nextInt();
                                    switch (order) {
                                        case 1:
                                            for (int i = 0; i < size; i++)
                                                for (int j = i + 1; j < size; j++)
                                                    if (array[i] > array[j]) {
                                                        temp = array[i];
                                                        array[i] = array[j];
                                                        array[j] = temp;
                                                    }
                                            stat = true;
                                        break;
                                        case 2:
                                            for (int i = 0; i < size; i++)
                                                for (int j = i + 1; j < size; j++)
                                                    if (array[i] < array[j]) {
                                                        temp = array[i];
                                                        array[i] = array[j];
                                                        array[j] = temp;
                                                    }
                                        break;
                                    }
                                } else
                                    System.out.println("Sorry,not exist any element");
                            break;
                            case 4:
                                if (flag) {
                                    int max = array[0];
                                    for (int i = 1; i < size; i++)
                                        if (array[i] > max)
                                            max = array[i];
                                    System.out.println("Maximum element is " + max);
                                } else
                                    System.out.println("Sorry,not exist any element");
                            break;
                            case 5:
                                if (flag) {
                                    int index = -1;
                                    System.out.println("What is type of searching :");
                                    System.out.println("1_Linear search");
                                    System.out.println("2_Binary search");
                                    int search = input.nextInt();
                                    System.out.println("Enter number that you want to searching it :");
                                    int number = input.nextInt();
                                    switch (search) {
                                        case 1:
                                            for (int i = 0; i < size; i++)
                                                if (array[i] == number) {
                                                    index = i;
                                                    break;
                                                }
                                            if (index != -1)
                                                System.out.println("The number is exist in " + index);
                                            else
                                                System.out.println("The number is not exist in array !!");
                                        break;
                                        case 2:
                                            if (stat) {
                                                int start = 0;
                                                int end = size - 1;
                                                int mid;
                                                while (start <= end) {
                                                    mid = (start + end) / 2;
                                                    if (number == array[mid]) {
                                                        index = mid;
                                                        break;
                                                    }
                                                    else if (array[mid] < number)
                                                        start = mid + 1;
                                                    else
                                                        end = mid - 1;
                                                }
                                                if (index != -1)
                                                    System.out.println("The number is exist in " + index);
                                                else
                                                    System.out.println("The number is not exist in array !!");
                                            } else System.out.println("Sorry,You must be order ascending in the first !");
                                        break;
                                    }
                                } else
                                    System.out.println("Sorry,not exist any element");
                            break;
                            case 6:
                                System.out.println("good bye, Exiting 1D Arrays program.");
                            break;
                            default:
                                System.out.println("Sorry,your choice is wrong");
                        }
                    }while (choice2 != 6);
                break;
                case 2:
                    int choice3;
                    do {
                        System.out.println("Choose one of the following options:");
                        System.out.println("1_Display Even and Odd numbers of array 2 Dimensions ");
                        System.out.println("2_Enter data of student , display name and average");
                        System.out.println("3_Program to exam simple ");
                        System.out.println("4_Exit this program ");
                        choice3 = input.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("Enter number rows of array : ");
                                int rows = input.nextInt();
                                System.out.println("Enter number columns of array : ");
                                int columns = input.nextInt();
                                int numbers[][] = new int[rows][columns];
                                int even = 0, odd = 0;
                                System.out.println("Enter elements of array : ");
                                for (int i = 0; i < rows; i++) {
                                    for (int j = 0; j < columns; j++) {
                                        numbers[i][j] = input.nextInt();
                                        if (numbers[i][j] % 2 == 0)
                                            even++;
                                        else
                                            odd++;
                                    }
                                }
                                int[] arrayEven = new int[even];
                                int[] arrayOdd = new int[odd];
                                even = 0;
                                odd = 0;
                                for (int i = 0; i < rows; i++) {
                                    for (int j = 0; j < columns; j++) {
                                        if (numbers[i][j] % 2 == 0) {
                                            arrayEven[even] = numbers[i][j];
                                            even++;
                                        } else {
                                            arrayOdd[odd] = numbers[i][j];
                                            odd++;
                                        }
                                    }
                                }
                                System.out.println("The numbers are Even :");
                                for (int i = 0; i < arrayEven.length; i++) {
                                    System.out.print(arrayEven[i] + " ");
                                }
                                System.out.println("\nThe numbers are Odd :");
                                for (int i = 0; i < arrayOdd.length; i++) {
                                    System.out.print(arrayOdd[i] + " ");
                                }
                                System.out.println();
                            break;
                            case 2:
                                System.out.println("Enter number of students");
                                int students = input.nextInt();
                                System.out.println("Enter number of subjects");
                                int subjects = input.nextInt();
                                String[] studentsNames = new String[students];
                                float[][] grade = new float[students][subjects];
                                float[] average = new float[students];
                                for (int i = 0; i < students; i++) {
                                    float totalGrades = 0;
                                    System.out.println("Enter student" + (i + 1) + "'s name :");
                                    studentsNames[i] = input.next();
                                    for (int j = 0; j < subjects; j++) {
                                        System.out.println("Enter subject " + (j + 1) + "'s grade :");
                                        grade[i][j] = input.nextFloat();
                                        totalGrades += grade[i][j];
                                    }
                                    average[i] = totalGrades / subjects;
                                }
                                for (int i = 0; i < students; i++) {
                                    System.out.println("grade " + studentsNames[i] + ": " + average[i]);
                                }
                            break;
                            case 3:
                                int answerCorrect[] = {2, 4, 2, 2};
                                int answer[] = new int[4];
                                int ansCorrect = 0;
                                for (int i = 0; i < 4; i++) {
                                    if (i == 0) {
                                        System.out.println("1_What is the correct index for the last element in an array of size 9 in java?\n1) 9\n2) 8\n3) 10\n4) 1");
                                        System.out.println("Enter your answer :");
                                        answer[i] = input.nextInt();
                                    }
                                    else if (i == 1) {
                                        System.out.println("2_Which of the following methods is correct for declaring and initializing an integer array in java? ");
                                        System.out.println("1) int array1[] = new int[5]; ");
                                        System.out.println("2) int[] array1 = { 10, 20, 30, 40 };");
                                        System.out.println("3) int array1[]; array1= new int[5];");
                                        System.out.println("4) All of the above are correct ");
                                        System.out.println("Enter your answer :");
                                        answer[i] = input.nextInt();
                                    }
                                    else if (i == 2) {
                                        System.out.println("3_How do you declare a 2D array in java with 3 rows and 4 columns?");
                                        System.out.println("1) int array2[][] = new int[4][3];");
                                        System.out.println("2) int array2[][] = new int[3][4];");
                                        System.out.println("3) int array2[3][4];");
                                        System.out.println("4) int[][] array2 = [3][4];");
                                        System.out.println("Enter your answer :");
                                        answer[i] = input.nextInt();
                                    }
                                    else if (i == 3) {
                                        System.out.println("4_What are arrays used for in java ?");
                                        System.out.println("1) Permanent storage of data that persists after program termination");
                                        System.out.println("2) Temporary storage of data that during program execution only ");
                                        System.out.println("3) Storing data in external files ");
                                        System.out.println("4) Creating database connection");
                                        System.out.println("Enter your answer :");
                                        answer[i] = input.nextInt();
                                    }
                                    System.out.println("************************");
                                    if (answer[i] == answerCorrect[i]) {
                                        System.out.println("CORRECT");
                                        ansCorrect++;
                                    } else
                                        System.out.println("WRONG");
                                    System.out.println("***********************************************");
                                }
                                System.out.println("Your score is : " + ansCorrect + " out of " + 4);
                            break;
                            case 4:
                                System.out.println("Good bye,Exiting 2D Arrays program.");
                            break;
                            default:
                                System.out.println("Wrong choice");
                        }
                    }while (choice3 !=4);
                break;
                case 3:
                    System.out.println("Good bye,Exiting main program.");
                break;
                default:
                       System.out.println("The choice is wrong !!");
            }
        }while (Choice1!=3);
    }
}