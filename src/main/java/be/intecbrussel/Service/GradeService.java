package be.intecbrussel.Service;

import be.intecbrussel.Data.GradeRepository;
import be.intecbrussel.Model.Grade;

public class GradeService {

    public void addGrade(Grade grade){
        GradeRepository repository = new GradeRepository();
        repository.addGrade(grade);
    }

    public void outputAllGrades(){
        GradeRepository repository = new GradeRepository();
        repository.getAllGrades();
    }

    public void outputGradeById(Long id){
        GradeRepository repository = new GradeRepository();
        repository.getGradeById(id);
    }

    public void updateGrade(Grade grade){
        GradeRepository repository = new GradeRepository();
        repository.updateGrade(grade);
    }

    public void deleteGrade(Grade grade){
        GradeRepository repository = new GradeRepository();
        repository.deleteGrade(grade);
    }

    public void deleteGradeById(Long id){
        GradeRepository repository = new GradeRepository();
        repository.deleteGradeById(id);
    }
}
