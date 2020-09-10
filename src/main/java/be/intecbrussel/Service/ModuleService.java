package be.intecbrussel.Service;

import be.intecbrussel.Data.moduleRepository;

public class ModuleService {

    public void outputAllModules(){
        moduleRepository repository = new moduleRepository();
        repository.getAllModules();
    }

    public void outputModule(Long id){
        moduleRepository repository = new moduleRepository();
        repository.getModuleById(id);
    }
}
