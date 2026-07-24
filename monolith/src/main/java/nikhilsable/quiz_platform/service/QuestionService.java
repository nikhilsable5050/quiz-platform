package nikhilsable.quiz_platform.service;

import nikhilsable.quiz_platform.dao.QuestionDao;
import nikhilsable.quiz_platform.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteQuestion(Integer id) {
        questionDao.deleteById(id);
        return "Question deleted successfully";
    }
}
