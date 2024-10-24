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


        //Task2

        System.out.println("Task2");
        System.out.println("chawere 3 ricxvi:");
        Scanner input2=new Scanner(System.in);
        Task2 task2= new Task2();
        int a =input2.nextInt();
        int b =input2.nextInt();
        int c =input2.nextInt();
        int shedegi2= task2.findLargest(a,b,c);
        System.out.println("largest number :" + shedegi2);


    }
}
