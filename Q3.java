import java.util.*;

public class Q3 {
    public static int greaterNum(int a, int b){
        int greater;
        if(a>b){
            greater=a;
        }else{
            greater=b;
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int greater=greaterNum(a,b);
        System.out.println("Greater number is "+ greater);
    }
}
