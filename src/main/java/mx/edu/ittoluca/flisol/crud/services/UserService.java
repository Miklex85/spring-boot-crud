package mx.edu.ittoluca.flisol.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.ittoluca.flisol.crud.entities.User;
import mx.edu.ittoluca.flisol.crud.repositories.UserRepository;

@Service
@Transactional
public class UserService {
	
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<User> findAll() {
    	return (List<User>) userRepository.findAll();
    }
    
    public void saveUser(User user) {
    	userRepository.save(user);
    }
    
    public void deleteUser(long id) {
    	User user = getUser(id);
    	userRepository.delete(user);
    }
    
    public User getUser(long id) {
    	return (User) userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID Inválido:" + id));
    }

}
