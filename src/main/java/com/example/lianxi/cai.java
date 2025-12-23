package com.example.lianxi;

import java.util.Random;
import java.util.Scanner;

public class cai {
    int n;

    public cai() {
        // 在构造方法中初始化n
        Random random = new Random();
        n = random.nextInt(100) + 1; // 生成1到100之间的随机数
        System.out.println("已生成1-100之间的随机数，开始猜吧！");
    }

    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.print("请输入你猜的数字: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > n) {
                System.out.println("太大了！");
            } else if (guess < n) {
                System.out.println("太小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("你一共猜了 " + attempts + " 次");
            }
        } while (guess != n);

        scanner.close();
    }

    public static void main(String[] args) {
        cai game = new cai();
        game.guessGame();
    }
}