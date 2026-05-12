import java.util.Scanner;
public class GoodsManage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          String []Things={"Milk","Cheese","Cigar","Tuna"};
          int [][]Price_Amount={{100,1200},{50,700},{30,8000},{30,800}};
        System.out.println("Goods\tPrice ");
        for (int i=0;i<Things.length;i++) {
            System.out.println(Things[i]+"\t"+Price_Amount[i][1]);
        }
        int[] quantityTemp=new int[Things.length];
        for(int i = 0; i <Things.length; i++) {
            System.out.println("how many " + Things[i] + " that you bought?");
            quantityTemp[i] = input.nextInt();
            input.nextLine();
            if(quantityTemp[i]>Price_Amount[i][0]) {
                System.out.println("You want to bought amount greater than amount exist !!\nbut these "+Price_Amount[i][0]+" are only with us , do you want them ? ");
                String answer = input.nextLine();
                if(answer.equalsIgnoreCase("yes")) quantityTemp[i]=Price_Amount[i][0];
                else quantityTemp[i]=0;
            }
        }

        int cost=0;
        for(int j=0;j<Things.length;j++){
            int priceTemp=Price_Amount[j][1]*quantityTemp[j];
            System.out.println(Things[j]+"\t"+Price_Amount[j][1]+" * "+quantityTemp[j]+" = "+priceTemp);
            cost+=priceTemp;
        }
        System.out.println("Total Cost: "+cost);

        for(int j=0;j<Things.length;j++){
            System.out.println(Things[j]+"\t"+(Price_Amount[j][0]-quantityTemp[j]));
        }
    }
}
