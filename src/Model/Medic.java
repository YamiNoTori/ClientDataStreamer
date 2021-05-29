package Model;

public class Medic extends Client
{

    public Medic(String name, String second, int _age, String city) {
        super(name, second, _age, city);
    }

    @Override
    public String Say()
    {
        return "Hi! My name is "+getFirstName()+" "+getSecondName()+". I am a medical and I am "+getAge()+
                " years old. I live in "+getCityName()+".";
    }

}
