package cn.pauu.loginregister.test;

import java.util.Scanner;

import cn.pauu.loginregister.dao.UserDao;
import cn.pauu.loginregister.dao.impl.UserDaoImpl;
import cn.pauu.loginregister.game.GuessNumber;
import cn.pauu.loginregister.pojo.User;

/**
 * �û���¼ע�������
 * 
 * @author peng.xing
 * @version v1.0
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("----------��ӭ����----------");
			System.out.println("1��¼");
			System.out.println("2ע��");
			System.out.println("3�˳�");
			System.out.println("���������ѡ��");
			Scanner sc = new Scanner(System.in);
			String choise = sc.nextLine();
			UserDao userDao = new UserDaoImpl();
			switch (choise) {
			case "1":
				System.out.println("---------��¼����--------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("���������룺");
				String password = sc.nextLine();
				boolean flag = userDao.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ���");
					System.out.println("Ҫ����y/n");
					while (true) {
						String isPlay = sc.nextLine();
						if ("y".equalsIgnoreCase(isPlay)) {
							GuessNumber.start();
							System.out.println("������y/n");
						}else{
							break;
						}
					}
					System.exit(0);
				} else {
					System.out.println("�û������������");
				}
				break;
			case "2":
				System.out.println("---------ע�����--------");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("���������룺");
				String newPassword = sc.nextLine();
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				userDao.register(user);
				System.out.println("ע��ɹ���");
				break;
			case "3":
			default:
				System.out.println("�˳���");
				System.exit(0);
				break;
			}
		}
	}
}
