package com.gmail.ahmedded.homework.homework14;

public class Demo {
    public static void main(String[] args) {
        Printer printer = new PrinterWork();

        // все заработало как надо исправлял кучу времени
        Message m1 = new Message("Яхаваю шавуху", "Ахмедик братик");
        Message m2 = new Message("Я анонимусик", null);
        Message m3 = new Message(null, null);

        printer.print(m1);
        printer.print(m2);
        printer.print(m3);
    }
}
