package codesmells;

// Message chain asks for one object, then another, etc.

public class MessageChain {
  
  class Health {
    private int amount = 100;
    
    public void reduce(int amnt) {
      amount -= amnt;
    }
  }
  
  class Enemy {
    private Health health = new Health();
    
    public void takeDamage(int amnt) {
      health.reduce(amnt);
    }
  }
  
  class Player {
    public void attack(Enemy e) {
      // Fix the message chain by adding reduce() to enemy
      e.takeDamage(10);
    }
  }
}
