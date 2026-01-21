 import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    // Create scene objects
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();

    // Call the drawscene methods
    lastYear.drawScene();
    thisYear.drawScene();

    // Plays the scenes 
    Theater.playScenes(lastYear, thisYear);  
  }
}