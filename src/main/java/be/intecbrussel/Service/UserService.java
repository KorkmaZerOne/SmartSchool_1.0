package be.intecbrussel.Service;

import be.intecbrussel.Data.personRepository;
import be.intecbrussel.Data.userRepository;
import be.intecbrussel.Model.User;

public class UserService {

    public void addUser(User user){
        userRepository repository = new userRepository();
        repository.addUser(user);
    }

    public void outputAllUsers(){
        userRepository repository = new userRepository();
        repository.getAllUsers();
    }

    public void outputUser(String login){
        userRepository repository = new userRepository();
        repository.getUserByLogin(login);
    }
}