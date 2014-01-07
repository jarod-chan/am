package cn.fyg.am.infrastructure.encrypt.impl;

import org.apache.commons.codec.digest.DigestUtils;


import cn.fyg.am.infrastructure.encrypt.Encipher;
import cn.fyg.am.infrastructure.encrypt.Encrypted;

import com.google.common.base.Preconditions;

public class EncipherImpl implements Encipher {

	@Override
	public Encrypted encrypt(String password) {
		Preconditions.checkNotNull(password,"password is null");
		SaltGenerator saltGenerator=new SaltGenerator();
		String salt = saltGenerator.getSalt();
		String encryptedStr=DigestUtils.sha1Hex(password.trim()+salt).toString();
		return new EncryptedItem(salt,encryptedStr);
	}

}
