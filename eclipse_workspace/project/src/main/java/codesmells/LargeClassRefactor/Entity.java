package codesmells.LargeClassRefactor;

public class Entity {

		private Health eHealth;
    IEntityAttack atk = new MeleeAttack();

		public void takeDamage(double amnt) {
      eHealth.takeDamage(amnt);
    }

		public void eAttack(Entity e) {
			atk.attack(e);
		}
}
