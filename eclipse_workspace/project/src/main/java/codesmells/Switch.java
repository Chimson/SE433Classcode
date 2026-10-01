package codesmells;

// How do you use polymorphism to eliminate this code smell
// could use inheritance or any other abstraction

public class Switch {

	interface IAttack {
		void attack();
	}

  public class Enemy {

    private String type;

    public Enemy(String type) {
      this.type = type;
    }

    public void attack() {
			System.out.println("Unknown enemy attacks!");
    }

		// make the same kind of class for Dragon, and Orc
		class Goblin implements IAttack {
			@Override
			public void attack() {
				System.out.println("Goblin slashes with a dagger!");
			}
		}

		public void demo() {
			// Enemy e = new Enemy("GOBLIN");
			// e.attack();

			IAttack g = new Goblin();
			g.attack();

			// e.getAttacker().getEntity().getHealth().getHealthValue().getAmount().reduce();
		}

  }

}