package com.gmail.ahmedded.homework.homework15;

public class AdvierWork implements Advier {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Не умри ток понедельник");
                break;
            case TUESDAY:
                System.out.println("Еще чучуть");
                break;
            case WEDNESDAY:
                System.out.println("Можно чучуть в бар ну и что с утра голова болит");
                break;
            case THURSDAY:
                System.out.println("Завтра пятница ура можно пойти сделать 10 кружку кофе");
                break;
            case FRIDAY:
                System.out.println("С днюхой брат");
                break;
            case SATURDAY:
                System.out.println("Го в бар ну в среду не хватило");
                break;
            case SUNDAY:
                System.out.println("Сегодня в басик с друзьями поедеш");
                break;
        }
    }
}
