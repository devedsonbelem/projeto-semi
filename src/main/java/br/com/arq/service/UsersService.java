package br.com.arq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.arq.entity.Users;
import br.com.arq.help.PasswordUsers;
import br.com.arq.interfaces.IUsersService;
import br.com.arq.repository.UsersRepository;

@Service
public class UsersService implements IUsersService {

	private final UsersRepository usersRepository;

	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public Object findByIdService(String id) throws Exception {
		Optional<Users> resp = this.usersRepository.findById(id);
		if (resp.isEmpty()) {
			throw new Exception("Not Found, 404");
		}
		return resp;
	}

	@Override
	public List<Users> findAllService() throws Exception {
		return this.usersRepository.findAll();
	}

	@Override
	public Object save(Users users) throws Exception {
		users.setPassword(PasswordUsers.generatePassword(users.getPassword()));
		users.setStatus("created");
		Users resp = this.usersRepository.save(users);
		if (resp == null) {
			throw new Exception(" Error Server Internal, 500");
		}
		return resp;
	}

	public Object findByLogin(Users users) throws Exception {

		Users resp = this.usersRepository.findByEmail(users.getEmail());
		Boolean resultado = PasswordUsers.checkPassword(users.getPassword(), resp.getPassword());
		if (resultado) {
			resp.setStatus("logado");
			return resp;
		} else {
			throw new Exception("Error server Internal 500");
		}
	}
}
