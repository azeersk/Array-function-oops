import java.util.Scanner;

public class ExamplesArray {
    public static void Product(int a){
        Scanner input = new Scanner(System.in);
        String[][] Details = new String[2][a];
        for(int i=0; i<2; i++){
            for(int j=0; j<a; j++){
                Details[i][j] = input.nextLine();
            }
        }

//        for(int k=0; k<2; k++){
//            for(int l=0; l<a; l++){
//                System.out.print(Details[k][l]);
//            }
//            System.out.println();
//        }
        for(int k=0; k<a; k++){
            System.out.println("Name: "+Details[0][k]+"   "+"Cast: " + Details[1][k]);
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        Product(a);
    }
}
