import java.util.Scanner;
//Task1
public class Run {
    public static void main(String[] args) {
        System.out.println( "chawere ricxvi");
        Scanner input  = new Scanner(System.in);
        int ricxvi = input.nextInt();
        Task1 task1= new Task1();
        boolean shedegi = task1.isEven(ricxvi);
        System.out.println(task1.isEven(ricxvi));


    }
}
