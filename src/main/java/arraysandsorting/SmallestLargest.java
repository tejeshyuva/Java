import java.util.Scanner;
public class SmallestLargest{
    public static void main (String [] args){
        int []array = new int [100];
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("print the size of the array:");
        n=sc.nextInt();
        if ( n==0){
            System.out.println("no array size declared");
        }
        else{
        System.out.println("enter the elements of array:");
        for ( i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int largest=array[0];
        int smallest=array[0];
        for ( i=1;i<n;i++){
            if(array[i]>largest){
               largest=array[i];
            }
            if(array[i]<smallest){
                smallest=array[i];
            }

        }
    System.out.println(" the largest and smallest element in the array is :"+largest+","+smallest);
    sc.close();
        }
    }
}
