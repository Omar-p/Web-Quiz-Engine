package engine.contollers;

import engine.model.Quiz;
import engine.model.Result;
import engine.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quiz")
public class QuizRestController {

  private final QuizService quizService;

  public QuizRestController(QuizService quizService) {
    this.quizService = quizService;
  }

  @GetMapping
  public ResponseEntity<Quiz> getQuiz() {
    return ResponseEntity.ok(this.quizService.getQuiz());
  }

  @PostMapping
  public ResponseEntity<Result> quizAnswer(@RequestParam("answer") int answer) {
    return ResponseEntity.ok(this.quizService.checkAnswer(answer));
  }


}
