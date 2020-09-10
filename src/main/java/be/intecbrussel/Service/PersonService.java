package be.intecbrussel.Service;

import be.intecbrussel.Data.moduleRepository;
import be.intecbrussel.Data.personRepository;
import be.intecbrussel.Data.userRepository;
import be.intecbrussel.Model.Person;
import be.intecbrussel.Model.User;

public class PersonService {

    public void addPerson(Person person) {
        personRepository repository = new personRepository();
        repository.addPerson(person);
    }

    public void outputAllPersons(){
        personRepository repository = new personRepository();
        repository.getAllPersons();
    }

    public void outputPerson(int id){
        personRepository repository = new personRepository();
        repository.getPersonById(id);
    }

}
