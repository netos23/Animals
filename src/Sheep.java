public class Sheep extends AbstractAnimal {
	public Sheep(int hp) {
		super(hp);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("Sheep moving");
	}

	@Override
	public void greet() {
		super.greet();
		System.out.println("Bee");
	}
}
