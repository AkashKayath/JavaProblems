import java.util.Scanner;

public class Arrays {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    
        int arr[]= new int[n];
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        System.out.println(max);
        System.out.println(min);
    
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        } 

        System.out.println("max is : "+max);
        System.out.println("min is : "+min);
    }
    
}
