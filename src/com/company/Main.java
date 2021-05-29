package com.company;

import Model.Client;
import Model.Medic;

public class Main {

    public static void main(String[] args)
    {
        Client med1 = new Medic("Alex", "Strumanov", 22, "Moscow");
        System.out.println(med1.Say());

    }
}
