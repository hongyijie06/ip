public class Task {
  protected String description;
  protected int taskIndex;
  protected boolean isDone;

  public Task(String description) {
    this.description = description;
    this.isDone = false;
  }

  public String getStatusIcon() {
    return (isDone ? "X" : " "); // mark done task with X
  }

  public void markAsDone(){
    this.isDone = true;

  }

  public void unmarkDone(){
    this.isDone = false;
  }
}
