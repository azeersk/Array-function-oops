import java.util.Scanner;

public class StudentInformation {
    private int id;
    private String Name;
    public void setter(int idOne){
        id = idOne;
    }
    public int getter(){
        return id;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        StudentInformation sd = new StudentInformation();
        sd.setter(id);
        System.out.println(sd.getter());
    }
}
