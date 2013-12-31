package am.infrastructure.encrypt.impl;

import org.apache.commons.codec.digest.DigestUtils;

import am.infrastructure.encrypt.Encipher;
import am.infrastructure.encrypt.Encrypted;

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
