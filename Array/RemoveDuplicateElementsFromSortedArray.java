import java.util.*;
public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        1 2 3 3 3
//        j=2
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[n-1];
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
