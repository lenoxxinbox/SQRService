package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int initialRange, int finalRange) {

        int score = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (initialRange <= square && square <= finalRange) {
                score ++;
            }
        }
        return score;
    }

}
