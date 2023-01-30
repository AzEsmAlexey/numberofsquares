package ru.netology.sqr;

public class SQRService {

    public int calcNumberSqrt (int firstLimit, int secondLimit) {
        int numberSqrt = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= firstLimit) & (i * i <= secondLimit)) {
                numberSqrt++;
            }
        }
        return numberSqrt;

    }
}