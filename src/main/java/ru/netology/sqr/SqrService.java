package ru.netology.sqr;

public class SqrService {
    public int sqrcalc(int number) {
        for (int i = 10; 99 <= number; i++) {
            if (i * i > 200 && i * i < 300) {
                return i;
            }
        }
        return 0;
    }
}