package Task3;

import java.util.ArrayList;

public class Main
{
    static Customer mogens = new Customer("Mogens", "Jensen", "powerboi69");
    static Customer ib = new Customer("Ib", "Amdisen", "sverige1");
    static Customer joe = new Customer("Joe", "Hansen", "joe");
    static Customer birger = new Customer("Birger", "Ipsen", "jadetgodtdu");
    static Customer preben = new Customer("Preben", "Kunz", "kunz1");
    static Customer gert = new Customer("Gert", "Vinter", "gerteboi");

    static ArrayList<Customer> customers = new ArrayList<>()
    {{
        add(mogens);
        add(ib);
        add(joe);
        add(birger);
        add(preben);
        add(gert);
    }};

    public static void main(String[] args)
    {
        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer c: customers)
        {
            System.out.println(c);
        }
    }
}
