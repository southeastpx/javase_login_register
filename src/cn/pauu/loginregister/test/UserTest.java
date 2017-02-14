package cn.pauu.loginregister.test;

import java.util.Scanner;

import cn.pauu.loginregister.dao.UserDao;
import cn.pauu.loginregister.dao.impl.UserDaoImpl;
import cn.pauu.loginregister.game.GuessNumber;
import cn.pauu.loginregister.pojo.User;

/**
 * 用户登录注册测试类
 * 
 * @author peng.xing
 * @version v1.0
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("----------欢迎界面----------");
			System.out.println("1登录");
			System.out.println("2注册");
			System.out.println("3退出");
			System.out.println("请输入你的选择：");
			Scanner sc = new Scanner(System.in);
			String choise = sc.nextLine();
			UserDao userDao = new UserDaoImpl();
			switch (choise) {
			case "1":
				System.out.println("---------登录界面--------");
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();
				boolean flag = userDao.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功！");
					System.out.println("要玩吗？y/n");
					while (true) {
						String isPlay = sc.nextLine();
						if ("y".equalsIgnoreCase(isPlay)) {
							GuessNumber.start();
							System.out.println("还玩吗？y/n");
						}else{
							break;
						}
					}
					System.exit(0);
				} else {
					System.out.println("用户名或密码错误！");
				}
				break;
			case "2":
				System.out.println("---------注册界面--------");
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				userDao.register(user);
				System.out.println("注册成功！");
				break;
			case "3":
			default:
				System.out.println("退出！");
				System.exit(0);
				break;
			}
		}
	}
}
