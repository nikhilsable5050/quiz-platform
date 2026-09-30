package nikhilsable.quiz_platform.dao;

import nikhilsable.quiz_platform.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}