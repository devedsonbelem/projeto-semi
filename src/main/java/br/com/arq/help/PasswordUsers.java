package br.com.arq.help;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUsers {

	
	 public static String generatePassword(String password) {
		String hash = BCrypt.hashpw(password, BCrypt.gensalt());
		return hash;
	 }
	 
	                            //senha sem criptografar
	                            //resultado da senha criptografada
	 public static boolean checkPassword(String password, String hash ) {
		 return BCrypt.checkpw(password, hash);
	 }
}
