package codesmells;

public class LongParameterList {
 
  // fix by creating a DamageParams class parameter object
  class CombatUtils {
    
    public static int calculateDamage(
      int baseDamage,
      int strength,
      int armor,
      boolean isCritical,
      double critMultiplier)
    {
      int dmg = baseDamage + strength - armor;
      if (isCritical) {
        dmg *= critMultiplier;
      }
      return Math.max(dmg, 0);
    }
    
  }
}
