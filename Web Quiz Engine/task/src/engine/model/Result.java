package engine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
  @JsonProperty("success")
  private boolean isSuccess;
  private String feedback;

  public Result() {
  }

  public Result(boolean isSuccess, String feedback) {
    this.isSuccess = isSuccess;
    this.feedback = feedback;
  }

  public boolean isSuccess() {
    return isSuccess;
  }

  public void setSuccess(boolean success) {
    isSuccess = success;
  }

  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }
}
