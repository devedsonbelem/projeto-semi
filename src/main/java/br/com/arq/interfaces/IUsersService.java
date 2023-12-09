package br.com.arq.interfaces;

import java.util.List;

import br.com.arq.entity.Users;

public interface IUsersService {
	
	 public Object findByIdService(String id) throws Exception;
	 
	 public List<Users> findAllService() throws Exception;
	 
	 public Object save(Users users) throws Exception;
	 
	 public Object findByLogin(Users users) throws Exception;
}
