import java.util.Arrays;
import java.util.Scanner;
public class RemoveElementInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n-1];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0,j=0;i<n;i++){
            if(i!=pos){
                newArr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
