package com.francis;

import java.io.IOException;

public class Atm extends OptionMenu{


    public Atm(int login) {
        super(login);
    }

    public static void main(String[] args) throws IOException {
        OptionMenu optionMenu = new OptionMenu(5555);
        optionMenu.getLogin();

    }
}
