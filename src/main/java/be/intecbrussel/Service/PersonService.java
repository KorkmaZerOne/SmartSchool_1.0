package be.intecbrussel.Service;

import be.intecbrussel.Data.moduleRepository;
import be.intecbrussel.Data.personRepository;

public class PersonService {

    public void outputAllPersons(){
        personRepository repository = new personRepository();
        repository.getAllPersons();
    }

    public void outputPerson(int id){
        personRepository repository = new personRepository();
        repository.getPersonById(id);
    }

}
