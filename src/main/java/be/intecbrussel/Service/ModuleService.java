package be.intecbrussel.Service;

import be.intecbrussel.Data.moduleRepository;
import be.intecbrussel.Data.userRepository;
import be.intecbrussel.Model.Module;
import be.intecbrussel.Model.User;

public class ModuleService {

    public void addModule(Module module){
        moduleRepository repository = new moduleRepository();
        repository.addModule(module);
    }

    public void outputAllModules(){
        moduleRepository repository = new moduleRepository();
        repository.getAllModules();
    }

    public void outputModule(Long id){
        moduleRepository repository = new moduleRepository();
        repository.getModuleById(id);
    }
}
