 ## Caminho do  https://projectlombok.org/p2
 
 lombok
 
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Document

#####################################

```java=
package br.com.arq.help;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUsers {

	
	 public static String generatePassword(String password) {
		String hash = BCrypt.hashpw(password, BCrypt.gensalt());
		return hash;
	 }
	 
	 
	 public static boolean checkPassword(String password, String hash ) {
		 return BCrypt.checkpw(password, hash);
	 }
}
```


