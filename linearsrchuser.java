import java.util.Scanner;
class linearsrchuser{
 public static void main(String args[]){
 int n, search, arr[];
 int c = 0;
 Scanner in = new Scanner(System.in);
 System.out.println("Enter number of elements : ");
 n = in.nextInt();
 arr = new int[n];
 System.out.println("Enter those : "+n+" : elements");
 for(c=0;c<n;c++)
 arr[c] = in.nextInt();
 System.out.println("Enter value to find : ");
 search = in.nextInt();
 c=c+1;
 for(c=0;c<n;c++){
 if(arr[c]==search){
 System.out.println(search+" : is present at index : "+c+".");
 break;
}
}
 if(c==n)
 System.out.println(search+" : isn't present in array.");
}
}
