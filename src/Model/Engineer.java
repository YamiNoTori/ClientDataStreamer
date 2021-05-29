package Model;

public class Engineer extends Client
{
    public Engineer(String name, String second, int _age, String city) {
        super(name, second, _age, city);
    }

    @Override
    public String Say()
    {
        return "Hi! My name is " + getFirstName() + " " + getSecondName() + ". I am a engineer and I am " + getAge() +
                " years old. I live in " + getCityName()+".";
    }
}
