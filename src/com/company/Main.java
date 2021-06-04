package com.company;

import Controller.ClientController;
import Interface.IClient;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        ClientController controller = new ClientController();


        short bufNum = 1;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("1. Создать нового пользователя\n2. Вывести список пользователей на экран\n" +
                    "Ввод: ");
            try {
                bufNum = in.nextShort();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                break;
            }
            if (bufNum != 1 && bufNum != 2)
            {
                System.out.println("Некорректно введены данные! Для повторного ввода, нажмите на любую кнопку...");
                char c = (char) System.in.read();
                System.out.flush();
                continue;
            }
            break;
        }
        if (bufNum == 1)
        {
            while (true)
            {
                System.out.print("Имя: ");
                String name = in.next();

                System.out.print("Фамилия: ");
                String second = in.next();

                int age = 18;
                System.out.print("Возраст: ");
                try {
                    age = in.nextInt();
                }
                catch (Exception ex)
                {
                    System.out.print("Ошибка ввода данных! Ошибка: "+ex.getMessage());
                    continue;
                }
                System.out.print("Город: ");
                String city = in.next();

                controller.createNewClient(name, second, age, city);

                break;
            }
        }
        else
        {
            System.out.println("Сохранённые пользователи: ");
            IClient[] clients = controller.getClients();

            for (int i = 0; i < clients.length; i++)
            {
                System.out.println("Имя: "+clients[i].getFirstName());
                System.out.println("Фамилия: "+clients[i].getSecondName());
                System.out.println("Возраст: "+clients[i].getAge());
                System.out.println("Город: "+clients[i].getCityName()+"\n----------------------------");
            }
        }
    }
}
