package com.askerov;

public class Main {

    public static void main(String[] args) {
        // write your code her
        //Создать массив дробных (не целых) чисел размером 15 элементов и
        // наполнить его положительными отрицательниыми числами...
        double[] nums = {8, -2, -4, 2, 3, 6};
        int count = 0;
        double sum = 0;
        boolean isNegetiv = false;
//        nums[0] = 8;
//        nums[1] = -2;
//        nums[2] = -4;
//        nums[3] = 2;
//        nums[4] = 3;
//        nums[5] = 6;
        for (double i : nums) {
            if (i < 0) {
                isNegetiv = true;
            } else if (isNegetiv == true) {
                count++;
                sum += i;
            }
        }
//        double otvet = sum / count;
//        System.out.println("Ответ: " + otvet);
        System.out.println("Ответ: " + sum / count);
    }
}
