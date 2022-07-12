import java.io.InputStream;
import java.util.*;

public class Q1{

    public static float average(int a, int b, int c){
        float avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println("the avg of three numbers are : "+average(a, b, c));
    }
}