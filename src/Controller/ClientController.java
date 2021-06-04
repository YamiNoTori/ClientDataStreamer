package Controller;
import Interface.IClient;
import Interface.IFileInputOutput;
import Model.Client;


public class ClientController
{


    IFileInputOutput fileStream;
    IClient client;

    public ClientController()
    {
        fileStream = new InputOutputInFile();
    }


    public IClient[] getClients ()
    {
        return fileStream.Read();
    }
    private void setClient()
    {
        fileStream.Write(client);
    }

    public void createNewClient(String name, String secondName, int age, String city)
    {
        client = new Client(name, secondName, age, city);
        setClient();
    }



}
