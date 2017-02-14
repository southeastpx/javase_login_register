package cn.pauu.loginregister.dao;

import cn.pauu.loginregister.pojo.User;

/**
 * ��������û����в����Ľӿ�
 * 
 * @author peng.xing
 * @version v1.0
 */
public interface UserDao {
	/**
	 * ��¼����
	 * 
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
	 * @return �Ƿ��¼�ɹ�
	 */
	public abstract boolean isLogin(String username, String password);
	
	/**
	 * ע�Ṧ��
	 * @param user �û�ע�����Ϣ
	 */
	public abstract void register(User user);
}
