package codesmells;

// kept the classes together for demonstration
// How could you split up this class?


public class LargeClass {
  
  class Player {
    
    private int health;
    private double healthModifier;
    public void heal() {}
    public void takeDamage() {}
    // other health modifying events
    
    private int meleeAttack;
    private double meleeAttackModifier;
    private int rangedAttack;
    private int rangedAttackModifier;
    public void swordAttack(Enemy e) {}
    public void bowAttack(Enemy e) {}
    // many other weapon based attacks
    
    // position data and various other position altering methods
    
  }
  
  class Enemy {}
  
  interface IAttackModifier {
    public void apply(double amount);
  }

  class MeleeAttack implements IAttackModifier {
    double meleeAttack;
    public void apply(double amount) {}
  }



}
