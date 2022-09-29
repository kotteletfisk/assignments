import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> actions = new ArrayList<>()
        {
            {
                add("1) Start Game");
                add("2) Resume Game");
                add("3) Pause Game");
                add("4) End Game");
            }
        };

        Menu menu = new Menu(actions);
        String answer = menu.showMenu();

        int choice = Integer.parseInt(answer);

        doAction(choice);

       // menu.showMenu();

    }

    public static void doAction(int i)
    {
        switch (i)
        {
            case 1 -> System.out.println("Starting game...");
            case 2 -> System.out.println("Resuming game...");
            case 3 -> System.out.println("Pausing game...");
            case 4 -> System.out.println("Ending game...");
        }
    }
}
