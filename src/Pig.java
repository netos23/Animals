public class Pig extends AbstractAnimal{
	public Pig(int hp) {
		super(hp);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("Pig moov");
	}

	@Override
	public void greet() {
		super.greet();
		System.out.println("Hr, hr");
	}
}
