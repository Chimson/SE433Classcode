package codesmells;

// How do you use polymorphism to eliminate this code smell?

public class Switch {
  
  static abstract class Enemy {
    
    protected String type;
    
    public Enemy(String type) {
      this.type = type;
    }
    
    public abstract void attack();
      /*
      switch (type) {
        case "GOBLIN":
          System.out.println("Goblin slashes with a dagger!");
          break;
        case "ORC":
          System.out.println("Orc swings a heavy axe!");
          break;
        case "DRAGON":
          System.out.println("Dragon breathes fire!");
          break;
        default:
          System.out.println("Unknown enemy attacks!");
      }*/
      
  
  }

  static class Goblin extends Enemy {
    public Goblin() {
      super("Goblin");
    }

    public void attack() {
      System.out.println("Goblin slashes with a dagger!");
    }  
  }
  // class Orc extends Enemy{}
  
}
