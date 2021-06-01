package Controller;

import Interface.IFileInputOutput;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class InputOutputInFile implements IFileInputOutput
{
    public static final String PATH_OF_DATA = "C:\\Users\\DivaanCrow\\Desktop\\Java\\" +
            "Практика\\FileStream_29.05.21\\data\\huy.txt";


    public InputOutputInFile(String str)
    {

        Write(str);
    }


    // Чтение данных из файла
    public void Read()
    {
        try(FileReader reader = new FileReader(PATH_OF_DATA))
        {
            int c;

            while ((c = reader.read())!= -1)
            {
                System.out.println(c);
            }

        } catch (IOException ex)
        {

        }

    }


    // Запись данных в файл
    public void Write(String str)
    {
        try(FileWriter writer = new FileWriter(PATH_OF_DATA, false))
        {
            writer.write(str);
        } catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
