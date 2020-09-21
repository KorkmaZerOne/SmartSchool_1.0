package be.intecbrussel.Service;

import be.intecbrussel.Data.UserRepository;
import be.intecbrussel.Model.User;

public class UserService {

    public void addUser(User user){
        UserRepository repository = new UserRepository();
        repository.addUser(user);
    }

    public void outputAllUsers(){
        UserRepository repository = new UserRepository();
        repository.getAllUsers();
    }

    public void outputUserByLogin(String login){
        UserRepository repository = new UserRepository();
        repository.getUserByLogin(login);
    }

    public void updateUser(User user){
        UserRepository repository = new UserRepository();
        repository.updateUser(user);
    }

    public void deleteUser(User user){
        UserRepository repository = new UserRepository();
        repository.deleteUser(user);
    }

    public void deleteUserByLogin(String login){
        UserRepository repository = new UserRepository();
        repository.deleteUserByLogin(login);
    }
}