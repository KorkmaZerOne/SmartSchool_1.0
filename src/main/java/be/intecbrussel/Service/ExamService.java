package be.intecbrussel.Service;

import be.intecbrussel.Data.ExamRepository;
import be.intecbrussel.Model.Exam;

public class ExamService {

    public void addExam(Exam exam) {
        ExamRepository repository = new ExamRepository();
        repository.addExam(exam);
    }

    public void outputAllExams(){
        ExamRepository repository = new ExamRepository();
        repository.getAllExams();
    }

    public void outputExam(Long id) {
        ExamRepository repository = new ExamRepository();
        repository.getExamById(id);
    }

    public void updateExam(Exam exam){
        ExamRepository repository = new ExamRepository();
        repository.updateExam(exam);
    }

    public void deleteExam(Exam exam){
        ExamRepository repository = new ExamRepository();
        repository.deleteExam(exam);
    }

    public void deleteExam(Long id){
        ExamRepository repository = new ExamRepository();
        repository.deleteExamById(id);
    }
}
