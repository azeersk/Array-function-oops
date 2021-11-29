import java.util.Scanner;

public class carCompany {
    public void car(String name,String color,int minSpeed,int maxSpeed){
        System.out.println("Name: "+ name);
        System.out.println("Color: "+ color);
        System.out.println("Minimum Speed: "+ minSpeed);
        System.out.println("Maximum Speed: "+ maxSpeed);
    }
}
class bikeCompany extends carCompany{

    public void bike(String name,String color,int minSpeed,int maxSpeed){
        car(name,color,minSpeed,maxSpeed);
    }
}
class MainClass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        bikeCompany bC = new bikeCompany();
        System.out.println("Please Enter Car Details.");
        String Cname = input.nextLine();
        String Ccolor = input.nextLine();
        int CminSpeed = input.nextInt();
        int CmaxSpeed = input.nextInt();
        System.out.println("Please Enter Bike Details.");
        String Bname = input.nextLine();
        String Bcolor = input.nextLine();
        int BminSpeed = input.nextInt();
        int BmaxSpeed = input.nextInt();
        System.out.println("Car Details!");
        bC.car(Cname,Ccolor,CminSpeed,CmaxSpeed);
        System.out.println();
        System.out.println("Bike Details!");
        bC.bike(Bname,Bcolor,BminSpeed,BmaxSpeed);
    }
}
