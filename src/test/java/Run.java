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


        //Task3

        System.out.println("Task3");
        System.out.println("chawere sigrdze da sigane");
        Scanner input3=new Scanner(System.in);
        Task3 task3 = new Task3();
        double x = input3.nextDouble();
        double y = input3.nextDouble();
        double shedegi3= task3.calculateArea(x,y);
        System.out.println("partobi: " + shedegi3);


        //Task4

        System.out.println( "chawere saxeli");
        Scanner input4= new Scanner(System.in);
        String name = input4.nextLine();
        Task4 task4 = new Task4();
        task4.greet();
        task4.greet(name);

    }
}
