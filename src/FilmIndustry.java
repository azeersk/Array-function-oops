import java.util.Scanner;

class mainClassOne{
    public void Judva(String hero, String heroin, int year){
        System.out.println("Hero name: "+ hero);
        System.out.println("Heroin name: "+ heroin);
        System.out.println("movie released year: "+ year);
    }
    public void Judva(Double movieRating,String heroNew,String heroin, int year){
        System.out.println();
        System.out.println("Dubbed movie");
        System.out.println("Movie Rating: "+movieRating);
        System.out.println("Hero name: "+ heroNew);
        System.out.println("Heroin name: "+ heroin);
        System.out.println("movie released year: "+ year);
    }
}
public class FilmIndustry{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        mainClassOne FI = new mainClassOne();
        String heroOne = input.nextLine();
        String heroinOne = input.nextLine();
        int yearOne = input.nextInt();
        FI.Judva(heroOne,heroinOne,yearOne);
        System.out.println("Enter new Judva Movie");
        String a ="varun dhavan";
        double Rating = 8.4;
        String b = "jacklin";
        int yearTwo = 2020;
        FI.Judva(Rating,a,b,yearTwo);
    }
}