package Controller;

import Interface.IClient;
import Interface.IFileInputOutput;
import Model.Engineer;

import java.io.*;

public class InputOutputInFile implements IFileInputOutput
{
    public static final String PATH_OF_DATA = "C:\\Users\\DivaanCrow\\Desktop\\Java\\" +
            "Практика\\FileStream_29.05.21\\data";


    // Чтение данных из файла
    public IClient[] Read()
    {

        // ссылка на директорию
        File _file = new File(PATH_OF_DATA);
        // Количество файлов в директории (клиентов)
        int fileCount =  _file.listFiles().length;
        // Массив имён файлов
        String[] fileNames = _file.list();
        // Массив экземпляров пользователей
        IClient[] clients = new IClient[fileCount];
        // буферная переменная для записи строки из файла
        String s;
        // буферный массив для хранения всех строк из файла
        String[] arr = new String[4];
        // Счётчик строк файла
        int j = 0;


        // Проход по всем файлам (клиентам)
        for (int i = 0; i < fileCount; i++)
        {
            // Чтение конкретного файла
            try(BufferedReader reader = new BufferedReader(new FileReader(
                    PATH_OF_DATA+"\\"+fileNames[i])))
            {
                // Проход по каждой строке в файле
                while ((s = reader.readLine()) != null)
                {
                    arr[j] = s;
                    j++;
                }

            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }

            // Запись считанных данных в массив клиентов
            clients[i] = new Engineer(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);
            // Обнуление счётчика строк файла
            j = 0;
        }

        return clients;
    }


    // Запись данных в файл
    public void Write(IClient client)
    {

        try(FileWriter writer = new FileWriter(PATH_OF_DATA + client.getFirstName()+".txt",
                false))
        {
            writer.write(client.getFirstName()+"\n");
            writer.write(client.getSecondName()+"\n");
            writer.write(client.getAge()+"\n");
            writer.write(client.getCityName()+"\n");

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}
