public abstract class AbstractAnimal implements Animal {
	private int hp;

	public AbstractAnimal(int hp) {
		this.hp = hp;
	}

	@Override
	public void move() {
		if(!isAlive()){
			return;
		}
	}

	@Override
	public void greet() {
		if(!isAlive()){
			return;
		}
	}

	@Override
	public HitResult hit(int damage) {
		int receivedDamage = Math.min(damage, hp);
		hp -= receivedDamage;
		return new HitResult(receivedDamage, 0);
	}

	@Override
	public boolean isAlive() {
		return hp > 0;
	}
}
