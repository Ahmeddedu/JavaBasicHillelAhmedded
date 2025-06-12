package com.gmail.ahmedded.homework.homework14;

public class PrinterWork implements Printer {

    @Override
    public void print(Message message) {
        boolean isTextEmpty = message.getText() == null || message.getText().isEmpty();
        boolean isSenderEmpty = message.getSender() == null || message.getSender().isEmpty();

        if (isTextEmpty && isSenderEmpty) {
            Printer handler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Нічого від нікого вот так це інет брат");
                }
            };
            handler.print(message);

        } else if (isSenderEmpty) {
            System.out.println("Ктот не палица: " + message.getText());
        } else {
            System.out.println("Пользотваль : " + message.getSender() + " написал : " + message.getText());
        }
    }
}
