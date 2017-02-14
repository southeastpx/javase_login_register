package cn.pauu.loginregister.dao;

import cn.pauu.loginregister.pojo.User;

/**
 * 这是针对用户进行操作的接口
 * 
 * @author peng.xing
 * @version v1.0
 */
public interface UserDao {
	/**
	 * 登录功能
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 是否登录成功
	 */
	public abstract boolean isLogin(String username, String password);
	
	/**
	 * 注册功能
	 * @param user 用户注册的信息
	 */
	public abstract void register(User user);
}
