import java.util.Scanner;
public class SearchElementInAnArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        int out=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==ele) {
                out=1;
            }
        }
        System.out.print(out);
    }
}
