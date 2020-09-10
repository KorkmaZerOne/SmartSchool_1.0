package be.intecbrussel.Service;

import be.intecbrussel.Data.examRepository;

public class ExamService {

    public void outputAllExams(){
        examRepository repository = new examRepository();
        repository.getAllExams();
    }

    public void outputExam(Long id) {
        examRepository repository = new examRepository();
        repository.getExamById(id);
    }
}
