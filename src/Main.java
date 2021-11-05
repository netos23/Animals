public class Main {

    public static void main(String[] args) {
	    Animal ship = new Sheep(20);
        // big ship
        ship = new BigAnimal(ship);
        // golden ship
        ship = new GoldenAnimal(ship, 15);
    }
}
