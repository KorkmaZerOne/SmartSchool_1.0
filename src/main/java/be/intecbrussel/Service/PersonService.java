package be.intecbrussel.Service;

import be.intecbrussel.Data.PersonRepository;
import be.intecbrussel.Model.Person;

public class PersonService {

    public void addPerson(Person person) {
        PersonRepository repository = new PersonRepository();
        repository.addPerson(person);
    }

    public void outputAllPersons() {
        PersonRepository repository = new PersonRepository();
        repository.getAllPersons();
    }

    public void outputPersonById(int id) {
        PersonRepository repository = new PersonRepository();
        repository.getPersonById(id);
    }

    public void updatePerson(Person person) {
        PersonRepository repository = new PersonRepository();
        repository.updatePerson(person);
    }

    public void deletePerson(Person person) {
        PersonRepository repository = new PersonRepository();
        repository.deletePerson(person);
    }

    public void deletePersonById(int id) {
        PersonRepository repository = new PersonRepository();
        repository.deletePersonById(id);
    }
}
