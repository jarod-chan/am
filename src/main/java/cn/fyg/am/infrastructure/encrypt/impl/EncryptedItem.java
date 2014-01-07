package cn.fyg.am.infrastructure.encrypt.impl;

import cn.fyg.am.infrastructure.encrypt.Encrypted;

class EncryptedItem implements Encrypted {
	
	private String salt;
	
	private String encrypeted;

	public EncryptedItem(String salt, String encrypeted) {
		super();
		this.salt = salt;
		this.encrypeted = encrypeted;
	}

	@Override
	public String getSalt() {
		return this.salt;
	}

	@Override
	public String getEncrypeted() {
		return this.encrypeted;
	}

}
