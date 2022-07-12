import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int size, i, srch, res;
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter array size :");
        size = in.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("enter the values :");
        for(i=0; i<size; i++)
        arr[i] = in.nextInt();
        
        System.out.println("The array : " + Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("enter value to be search : ");
        srch = in.nextInt();
        System.out.println("the value to be search is : " + srch);
        res = Arrays.binarySearch(arr,srch);
        if(res<0)
            System.out.println("not found");
        else
            System.out.println("found at index: "+ res +"in the array.");
    }
    
}