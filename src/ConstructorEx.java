import java.util.Scanner;
class collage{
    public static void Collages(String name, String city, int pinCode){
        System.out.println("Collage Name: "+ name);
        System.out.println("Collage City: "+ city);
        System.out.println("Collage pin code: "+ pinCode);
    }
    void collage(String name, String city, int pinCode){
        Collages(name,city,pinCode);
    }
    collage(){
        System.out.println("Empty constructor this one practice and small example!");
    }
    void collage(String name, String city,String state, int pinCode){
        Collages(name,city,pinCode);
        System.out.println("Collage State: " + state);
    }
}

public class ConstructorEx {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String city = input.nextLine();
        String state = input.nextLine();
        int pinCode = input.nextInt();
        collage con = new collage();
        con.collage(name,city,pinCode);
        con.collage(name,city,state,pinCode);
    }
}
