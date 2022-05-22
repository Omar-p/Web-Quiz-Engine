package engine.services;

import engine.model.Quiz;
import engine.model.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
  private final Quiz quiz = new Quiz("The Java Logo",
      "What is depicted on the Java logo?",
      List.of("Robot", "Tea leaf", "Cup of coffee", "Bug"));

  private final Result successResult = new Result(true, "Congratulations, you're right!");
  private final Result failedResult = new Result(false, "Wrong answer! Please, try again.");

  public Quiz getQuiz() {
    return quiz;
  }

  public Result checkAnswer(int answer) {
    return answer == 2 ? this.successResult: this.failedResult;
  }
}
