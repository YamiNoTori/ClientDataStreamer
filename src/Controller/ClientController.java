package Controller;
import Model.Client;
import Model.Engineer;
import Model.Medic;

import java.lang.Math;

public class ClientController
{
    // Тестовые данные
    public String[] names = new String[]{"Dmitriy", "Alex", "Tamara", "Max"};
    public int namesSize = names.length;

    public String[] secondNames = new String[]{"Stukalov", "Trueman", "Volt", "Kral", "IDE"};
    public int secondNamesSize = secondNames.length;

    public String[] city = new String[]{"Moscow", "New York", "Kioto", "Almatы", "Paris", "London"};
    public int citySize = city.length;


    public String[] getRandomClient()
    {
        int rand = (int)(Math.random() * ((namesSize - 0)) + 0);
        String name = names[rand];
        rand = (int)(Math.random() * ((secondNamesSize - 0)) + 0);
        String second = secondNames[rand];
        rand = (int)(Math.random() * ((citySize - 0)) + 0);
        String _city = city[rand];
        int age = (int)(Math.random() * ((90 - 18)) + 18);
        String resultAge = Integer.toString(age);
        return new String[] {name, second, resultAge, _city};
    }

    public Medic getMedic()
    {
        String[] str = getRandomClient();
        return new Medic(str[0], str[1], Integer.parseInt(str[2]), str[3]);
    }
    public Engineer getEngineer()
    {
        String[] str = getRandomClient();
        return new Engineer(str[0], str[1], Integer.parseInt(str[2]), str[3]);
    }


}
