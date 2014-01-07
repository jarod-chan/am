package cn.fyg.am.domain.model.user;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String key; // 作为主键

	private String name; // 用户姓名

	private String cellphone; // 手机

	private String email; // 邮箱
	
	private String enabled; // 有效 'y'代表有效 'n'代表无效

	private String password; // 密码

	private String salt; // 加密字串

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
	


}
