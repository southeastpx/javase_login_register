package cn.pauu.loginregister.dao.impl;

import java.util.ArrayList;

import cn.pauu.loginregister.dao.UserDao;
import cn.pauu.loginregister.pojo.User;

/**
 * 这是用户操作的具体实现类（集合版）
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
		// 把用户信息存入集合
		arrayList.add(user);
	}

}
