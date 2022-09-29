import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("Please input your age");
        int age = scan.nextInt();
        System.out.println(age);

        int retYears = 67 - age;

        System.out.println("Haha, you can retire in " + retYears + " years. Good luck.");
    }
}
