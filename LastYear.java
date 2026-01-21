import org.code.theater.*;

public class LastYear extends Scene {
  
  //private variables
    private String[] memories;        
    private String[] images = {"lastyear.png"};
  
  // No argument constructor
  public LastYear() {
    memories = FileReader.toStringArray("lastyear.txt");
  }
  
  // Parameterized constructor
  public LastYear(String[] memoriesFile) {
    memories = memoriesFile;
  }
  
 /* Helper Method 
  * Prints all memories from the array to the console
  */
  public void printMemories() {
    for (String memory : memories) {
      System.out.println(memory);
    }
  }

  //returns the amount of goals in the goals array
  public int getMemoryCount() {
    return memories.length;
  }
  
 /* 
  * Draws the scene for last year
  * Preconditions: memories and images arrays are used
  * Postconditions: Scene is displayed with text and images
  */
  public void drawScene() {
    clear("white");
    drawImage(images[0], 0, 0, 400);
    
    for (int i = 0; i < memories.length; i++) {
      setTextColor("black");
      drawText(memories[i], 100, 300 + i * 30);
    }
    pause(5);
  }
}
