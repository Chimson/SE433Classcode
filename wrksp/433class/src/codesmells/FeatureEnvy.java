package codesmells;

public class FeatureEnvy {
  
  
  public class PlayerStats {
    // public for simplicity, but could be seen with private fields and public get methods
    public int baseDamage;
    public int strength;
    public int dexterity;
    public double critChance;
    public double critMultiplier;
    public String weaponType;
  }
  
  // Uses more of PlayerStats data than its own class data
  // How to fix?
  // Visitor pattern: make calculateDamage() a visit() in a DamageVisitor class
     // implements IStatsVisitor
     // add an acceptVisitor(IStatsVisitor) method to PlayerStats class anc call visit()
  
  public class DamageCalculator {
    
    public int calculateDamage(PlayerStats stats) {
      int dmg = stats.baseDamage + stats.strength;
      if (stats.critChance > 0.25) {
        dmg *= stats.critMultiplier;
      }
      if (stats.weaponType.equals("BOW")) {
        dmg += stats.dexterity / 2;
      }
      return dmg;
    }
  }
  
  
}
