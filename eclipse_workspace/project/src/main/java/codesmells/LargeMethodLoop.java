package codesmells;

// how to extract a method from the inner loop?
// Any other method to extract?

public class LargeMethodLoop {
  
  class LevelGenerator {
    
    public static void generateCol(int x, int height) {
      for (int y = 0; y < height; y++) {
        System.out.println("Placing tile at (" + x + ", " + y + ")");
        System.out.println("  Checking biome rules...");
        System.out.println("  Spawning props...");
        System.out.println("  Applying lighting...");
        System.out.println("  Registering tile in navmesh...");
      }

    }

    public void generateLevel(int width, int height) {
      System.out.println("Generating level...");
      for (int x = 0; x < width; x++) {
        generateCol(x, height);
      }
      System.out.println("Level generation complete.");
    }
    
  }

}
