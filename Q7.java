import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int countPositive=0;
        int countNegative=0;
        int countZero=0;

        // char choice;

        char n;
        do {
            System.out.println("Enter the number");
            int number=sc.nextInt();

            if(number>0){
                countPositive++;
            }else if(number<0){
                countNegative++;
            }else{
                countZero++;
            }

            System.out.println("Do you want to continue y/n? ");
            n=sc.next().charAt(0);

        } while (n =='y' || n == 'Y');

        System.out.println("total positive num :"+countPositive);
        System.out.println("total negative num :"+countNegative);
        System.out.println("total zero num :"+countZero);
    }
}
