public class SelectionSort {
    private static void printSortedArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};

        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }

        printSortedArray(arr);
    }
}
