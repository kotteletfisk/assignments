import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    private ArrayList<String> options = new ArrayList<>();

    Menu(ArrayList<String> options)
    {
        this.options = options;
    }

    public String showMenu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number to choose");
        //System.out.println(options); alternately:

        for (String o : options)
        {
            System.out.println(o);
        }

        return scan.nextLine();


    }
}
