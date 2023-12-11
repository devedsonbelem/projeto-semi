package br.com.arq.controller;
import org.springframework.http.ResponseEntity;
//
//import java.sql.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Users;
import br.com.arq.service.UsersService;

@RestController
@ResponseBody
@RequestMapping("/api")
public class UsersController {

	private final UsersService usersService;

	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}

	@PostMapping("/users")
	public ResponseEntity<?> create(@RequestBody Users users) {
		try {
			return ResponseEntity.status(200).body(this.usersService.save(users));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error:" + ex.getMessage());
		}
	}

	@PostMapping("/login")
	 public ResponseEntity<?> login(@RequestBody Users users){
		 try {
			return ResponseEntity.status(200).body(this.usersService.findByLogin(users));
		} catch (Exception ex) {
			 return  ResponseEntity.status(500).body("Error:" + ex.getMessage());
		}
	} 
		 
// 
//		
//    @PostMapping("/loginsecurity")
//    private String getJWTToken(@RequestBody Users user) {
//    	String secrectKey="minhachavedotoke";
//    	List<GrantedAuthority> grantedAuthorities = AuthorityUtils.
//    			commaSeparatedStringToAuthorityList(user.getRoles());
//    	
//    	String token = Jwts.
//    			builder().
//    			setId("artreinamento").
//    			setSubject(user.getName()).
//    			claim("authorities",
//    				  grantedAuthorities.stream().
//    				  map(GrantedAuthority::getAuthority).
//    			      collect(Collectors.toList()))
//    			.setIssuedAt(new Date(System.currentTimeMillis()))
//    			.setExpiration(new Date(System.currentTimeMillis() + 300000))
//    			.signWith(SignatureAlgorithm.HS512,
//    					secrectKey.getBytes()).compact();
//     
//   	  return "Bearer " + token;
//    }
//    
//    
//    
//    
//    
    
    
    

} 
	
 
	
	
	
	
	
	
	
	
	
	
	
	
 
