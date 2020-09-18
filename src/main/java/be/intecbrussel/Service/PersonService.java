package be.intecbrussel.Service;

import be.intecbrussel.Data.personRepository;
import be.intecbrussel.Model.Person;

public class PersonService {

    public void addPerson(Person person) {
        personRepository repository = new personRepository();
        repository.addPerson(person);
    }

    public void outputAllPersons() {
        personRepository repository = new personRepository();
        repository.getAllPersons();
    }

    public void outputPersonById(int id) {
        personRepository repository = new personRepository();
        repository.getPersonById(id);
    }

    public void updatePerson(Person person) {
        personRepository repository = new personRepository();
        repository.updatePerson(person);
    }

    public void deletePerson(Person person) {
        personRepository repository = new personRepository();
        repository.deletePerson(person);
    }

    public void deletePersonById(int id) {
        personRepository repository = new personRepository();
        repository.deletePersonById(id);
    }
}
