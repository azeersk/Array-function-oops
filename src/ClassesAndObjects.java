import java.util.Scanner;

class Car{
    public void Audi(String color, int min, int max){
        System.out.println("Car: Audi");
        System.out.println("Color: "+ color);
        System.out.println("Minimum Speed: "+ min);
        System.out.println("Maximum Speed: "+ max);
    }
    public void Ferrari(String color, int min, int max){
        System.out.println("Car: Ferrari");
        System.out.println("Color: "+ color);
        System.out.println("Minimum Speed: "+ min);
        System.out.println("Maximum Speed: "+ max);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String color = input.nextLine();
        int min = input.nextInt();
        int max = input.nextInt();
        Car car = new Car();
        car.Audi(color,min,max);
        System.out.println();
        System.out.println("----------- *** -----------");
        System.out.println();
        car.Ferrari(color,min,max);
    }
}
