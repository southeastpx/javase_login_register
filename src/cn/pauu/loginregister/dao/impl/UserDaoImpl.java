package cn.pauu.loginregister.dao.impl;

import java.util.ArrayList;

import cn.pauu.loginregister.dao.UserDao;
import cn.pauu.loginregister.pojo.User;

/**
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 * 
 * @author peng.xing
 * @version v1.0
 */
public class UserDaoImpl implements UserDao {
	private static ArrayList<User> arrayList = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		for (User user : arrayList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void register(User user) {
		// ���û���Ϣ���뼯��
		arrayList.add(user);
	}

}
