public class GoldenAnimal implements Animal {

	private final Animal animal;
	private final int reward;

	public GoldenAnimal(Animal animal, int reward) {
		this.animal = animal;
		this.reward = reward;
	}

	@Override
	public void move() {
		animal.move();
	}

	@Override
	public HitResult hit(int damage) {
		HitResult hit = animal.hit(damage);
		return new HitResult(hit.getDamageReceived(), hit.getReward() + reward);
	}

	@Override
	public void greet() {
		animal.greet();
	}

	@Override
	public boolean isAlive() {
		return animal.isAlive();
	}
}
