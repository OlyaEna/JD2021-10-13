package by.it.ena.jd02_02.service;

import by.it.ena.jd02_02.model.Good;

public interface CustomerAction {
    void enteredStore(); //вошел в магазин (мгновенно)

    Good chooseGood();//выбрал товар (от 0,5 до 2 секунд)

    void goQueue();

    void goOut(); //отправился на выход(мгновенно)
}
