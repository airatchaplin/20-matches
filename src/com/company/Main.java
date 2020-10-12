package com.company;

import Services.MainServiceImpl;

public class Main {

    public static MainServiceImpl mainService = new MainServiceImpl();

    public static void main(String[] args) {
        while (true) {
            mainService.newGame();
        }
    }
}
