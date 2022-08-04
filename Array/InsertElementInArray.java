import java.util.*;
public class InsertElementInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int element=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int newArr[]=new int[n+1];
        for(int i=n;i>pos;i--){
            newArr[i]=arr[i-1];
        }
        newArr[pos]=element;
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
//        System.out.println("Array after adding value: "+Arrays.toString(newArr));
        for(int i=0;i< newArr.length;i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
