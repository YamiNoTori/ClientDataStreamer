package com.company;

import Controller.ClientController;
import Interface.IClient;
import Model.Client;
import Model.Medic;


public class Main {

    public static void main(String[] args)
    {
        ClientController controller = new ClientController();



        while (true)
        {


            break;
        }


        IClient[] clients = controller.getClients();

        for (int i = 0; i < clients.length; i++)
        {
            System.out.println(clients[i].Say());
        }




    }
}
