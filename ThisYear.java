import org.code.theater.*;

public class ThisYear extends Scene {
  //private variables
  private String[] goals = {"2026 Goals: School, Studying, Sleep, Games"}; 
  private String[] images; 
  
  // No argument constructor
  public ThisYear() {
    images = FileReader.toStringArray("thisyearimages.txt");
  }
  
  // Parameterized constructor
    public ThisYear(String[] imageFiles) {
      images = imageFiles;
    }

  //returns the amount of goals in the goals array
  public int getGoalCount() {
    return goals.length;
  }
 /* Helper Method 
  * Prints all goals to the console
  */
  public void printGoals() {
    for (String goal : goals) {
      System.out.println(goal);
    }
  }
  
 /* 
  * Draws the scene for last year
  * Preconditions: Goals and images arrays are used
  * Postconditions: Scene is displayed with text and images
  */
  public void drawScene() {
    clear("white");
    drawImage(images[0], 0, 0, 400);
    for (int i = 0; i < goals.length; i++) {
      setTextColor("black");
      drawText(goals[i], 0, 300);
    }
    pause(5);
  }
}
