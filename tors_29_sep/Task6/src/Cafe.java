import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{
    public ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData()
    {
        File file = new File("coffees.txt");

        try
        {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine())
            {
                coffeeMenu.add(scan.nextLine());
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found, or permission denied");
        }


    }
}
