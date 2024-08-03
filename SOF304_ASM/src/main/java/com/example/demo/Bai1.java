package com.example.demo;

import java.util.List;

public class Bai1 {
    public int tong(double a, double b) {
        if (a % 1 != 0 || b % 1 != 0) {
            throw new IllegalArgumentException("nhap so nguyen");
        }

        return (int) a + (int) b;
    }

    public int tich(double a, double b) {
        if (a % 1 != 0 || b % 1 != 0) {
            throw new IllegalArgumentException("nhap so nguyen");
        }

        return (int) a * (int) b;
    }

    public int hieu(double a, double b) {
        if (a % 1 != 0 || b % 1 != 0) {
            throw new IllegalArgumentException("nhap so nguyen");
        }

        return (int) a - (int) b;
    }


    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}

