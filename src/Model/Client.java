package Model;

import Interface.IClient;

public class Client implements IClient
{
    // Поля
    private String firstName;
    private String secondName;
    private int age;
    private String cityName;

    // Свойства
    public String getFirstName() {return  firstName;}
    public String getSecondName() {return secondName;}
    public int getAge() {return age;}
    public String getCityName() {return cityName;}


    public Client(String name, String second, int _age, String city)
    {
        firstName = name;
        secondName = second;
        age = _age;
        cityName = city;
    }


    public String Say()
    {
        return this.toString();
    }

}
