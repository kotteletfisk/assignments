package Task1;

public class Main
{
    String Name;
    int age;

    public static void main(String[] args)
    {
        Driver me = new Driver("lasse", 24);

        Car skoda = new Car("Skoda", "Octavia",2010, "Convertible");
        Car subaru = new Car("Subaru", "Impreza WRX", 2015, "RallyFit");

        skoda.setDriver(me);
        subaru.setDriver(me);

        System.out.println(skoda.toString());
        System.out.println(me);
        System.out.println(subaru.toString());
        System.out.println(me);




    }




}
