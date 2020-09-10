package be.intecbrussel.Service;

import be.intecbrussel.Data.examRepository;
import be.intecbrussel.Data.moduleRepository;
import be.intecbrussel.Model.Exam;
import be.intecbrussel.Model.Module;

public class ExamService {

    public void addExam(Exam exam) {
        examRepository repository = new examRepository();
        repository.addExam(exam);
    }

    public void outputAllExams(){
        examRepository repository = new examRepository();
        repository.getAllExams();
    }

    public void outputExam(Long id) {
        examRepository repository = new examRepository();
        repository.getExamById(id);
    }
}
