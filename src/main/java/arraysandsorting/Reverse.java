import java.util.Scanner;
public class Reverse{
    public static void main (String [] args){
        int []array1 = new int [100];
        int []array2 =  new int [100];
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("print the size of the array:");
        n=sc.nextInt();
        System.out.println("enter the elements of array:");
        for ( i=0;i<n;i++){
            array1[i]=sc.nextInt();
            array2[i]=array1[i];
        }
        int start = 0;
        int end = n-1;
        while (start < end) {
            int temp = array1[start];
            array1[start] = array1[end];
            array1[end] = temp;
            start++;
            end--;
        }
        System.out.println("the reversed array is:");
        for ( i=0;i<n;i++){
            System.out.print(array1[i]);
        }
    }
}

