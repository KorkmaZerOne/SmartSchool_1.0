package be.intecbrussel.Service;

import be.intecbrussel.Data.personRepository;
import be.intecbrussel.Data.userRepository;

public class UserService {

    public void outputAllUsers(){
        userRepository repository = new userRepository();
        repository.getAllUsers();
    }

    public void outputUser(String login){
        userRepository repository = new userRepository();
        repository.getUserByLogin(login);
    }
}
