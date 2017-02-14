package cn.pauu.loginregister.game;

import java.util.Scanner;

/**
 * ������С��Ϸ
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
			System.out.println("��������µ�����(1-100):");
			int guessNumber = sc.nextInt();
			count++;
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "���ˣ�");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С�ˣ�");
			}else{
				System.out.println("��ϲ�㣬"+count+"�ξͲ����ˣ�");
				break;
			}
		}
	}
}
