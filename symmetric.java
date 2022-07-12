import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter row :");
        int row = in.nextInt();
        System.out.println("enter col :");
        int col = in.nextInt();
        
        int mat[][] = new int[row][col];
        
        System.out.println("enter matrix values :");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = in.nextInt();
            }
        }
        if(row!=col){
            System.out.println("matrix is not square.");
        }
        else{
            boolean symm = true;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(mat[i][j] != mat[j][i]){
                        symm = false;
                        break;
                    }
                }
            }
            if(symm){
                System.out.println("The matrix is symmetric....");
            }
            else{
                System.out.println("Is not symmetric....");
            }
        }
        in.close();
    }
}











