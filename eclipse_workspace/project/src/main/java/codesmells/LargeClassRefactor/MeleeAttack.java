package codesmells.LargeClassRefactor;

// create
public class MeleeAttack implements IEntityAttack{
  private int meleeAttack;
	private double meleeAttackModifier;

	@Override
	public void attack(Entity otherEntity) {
		double amnt = meleeAttack * meleeAttackModifier;
		otherEntity.takeDamage(amnt);
  }
}
