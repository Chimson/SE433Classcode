package codesmells;

public class LongParameterList {

  // fix by creating a DamageParams class parameter object
  class CombatUtils {

    public static int calculateDamage(DamageParams p)
    {
      int dmg = p.baseDamage + p.strength - p.armor;
      if (p.isCritical) {
        dmg *= p.critMultiplier;
      }
      return Math.max(dmg, 0);
    }

  }

	class DamageParams {
		int baseDamage;
		int strength;
		int armor;
		boolean isCritical;
		double critMultiplier;
	}

}