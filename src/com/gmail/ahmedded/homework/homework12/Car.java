package com.gmail.ahmedded.homework.homework12;

public class Car {
    // если я правильно понял нужно было сделать отдельно типо общий запуски и отдельно как запускаеться машина в приватных
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Погнали на автобан гоняти");
    }

    private void startElectricity() {
        System.out.println("ЕЄлектрика тута");
    }

    private void startCommand() {
        System.out.println("Якісь колманди тута тож");
    }

    private void startFuelSystem() {
        System.out.println("Бензинг потек по венам :)");
    }
}
