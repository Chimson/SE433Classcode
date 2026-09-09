package codesmells;

public class DupCode {
  
  // simple Enemy class for demonstation but bad design
  class Enemy {
    public int health;
  }
  
  class Player {
    private int meleeAttack;
    private double meleeAttackBoost;
    
    public void bowAttack(Enemy e) {
      int base = meleeAttack + 5;
      double boosted = base * meleeAttackBoost;
      int damage = (int) boosted;
      e.health -= damage;
    }
    
    public void swordAttack(Enemy e) {
      int base = meleeAttack + 7;
      double boosted = base * meleeAttackBoost;
      int damage = (int) boosted;
      e.health -= damage;
    }
    
    public void axeAttack(Enemy e) {
      int base = meleeAttack + 9;
      double boosted = base * meleeAttackBoost;
      int damage = (int) boosted;
      e.health -= damage;
    }
  }
  
}
