public class BigAnimal implements Animal {
	private Animal animal;
	private boolean isStunned;

	public BigAnimal(Animal animal) {
		this.animal = animal;
		isStunned = false;
	}

	@Override
	public void move() {
		if (!isStunned) {
			animal.move();
		}
		isStunned = false;
	}

	@Override
	public HitResult hit(int damage) {
		isStunned = true;
		return animal.hit(damage);
	}

	@Override
	public void greet() {
		if (!isStunned) {
			animal.greet();
		}
		isStunned = false;
	}

	@Override
	public boolean isAlive() {
		return animal.isAlive();
	}
}
