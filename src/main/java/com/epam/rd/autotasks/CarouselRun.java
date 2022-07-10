package com.epam.rd.autotasks;

public class CarouselRun {
    int position = 0;
    int[] carouselArray = DecrementingCarousel.carouselArray;

    public int next() {
        int count = 0;
        while (count < carouselArray.length && carouselArray[position %= carouselArray.length] <= 0) {
            position++;
            count++;
        }
        if (count == carouselArray.length) return -1;
        return carouselArray[position++]--;
    }

    public boolean isFinished() {
        for (int var: carouselArray) {
            if (var > 0) return false;
        }
        return true;
    }

}
