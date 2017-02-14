package cn.pauu.loginregister.game;

import java.util.Scanner;

/**
 * 猜数字小游戏
 * 
 * @author peng.xing
 * @version v1.0
 */
public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入你猜的数字(1-100):");
			int guessNumber = sc.nextInt();
			count++;
			if (guessNumber > number) {
				System.out.println("你猜的数字" + guessNumber + "大了！");
			} else if (guessNumber < number) {
				System.out.println("你猜的数字" + guessNumber + "小了！");
			}else{
				System.out.println("恭喜你，"+count+"次就猜中了！");
				break;
			}
		}
	}
}
