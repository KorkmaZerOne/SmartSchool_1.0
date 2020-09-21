package be.intecbrussel.Service;

import be.intecbrussel.Data.ModuleRepository;
import be.intecbrussel.Model.Module;

public class ModuleService {

    public void addModule(Module module){
        ModuleRepository repository = new ModuleRepository();
        repository.addModule(module);
    }

    public void outputAllModules(){
        ModuleRepository repository = new ModuleRepository();
        repository.getAllModules();
    }

    public void outputModule(Long id){
        ModuleRepository repository = new ModuleRepository();
        repository.getModuleById(id);
    }

    public void updateModule(Module module){
        ModuleRepository repository = new ModuleRepository();
        repository.updateModule(module);
    }

    public void deleteModule(Module module){
        ModuleRepository repository = new ModuleRepository();
        repository.deleteModule(module);
    }

    public void deleteModuleById(Long id){
        ModuleRepository repository = new ModuleRepository();
        repository.deleteModuleById(id);
    }
}
