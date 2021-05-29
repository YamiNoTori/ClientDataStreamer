package com.company;

import Controller.ClientController;
import Interface.IClient;
import Model.Client;


public class Main {

    public static void main(String[] args)
    {
        // Создание рандомного клиента
        ClientController controller = new ClientController();
        IClient c1 = controller.getEngineer();
        System.out.println(c1.Say());

    }
}
