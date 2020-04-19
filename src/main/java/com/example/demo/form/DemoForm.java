/**
 * 
 */
package com.example.demo.form;

import java.util.List;

import com.example.demo.entity.User;

/**
 * ユーザーエンティティのリストを格納するためのフォーム
 * @author fumming
 *
 */
public class DemoForm {

	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
