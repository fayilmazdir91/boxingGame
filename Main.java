package boxingGame;

public class Main {
	public static void main(String[] args) {
		Fighter ken = new Fighter("Ken", 15, 100, 90, 20);
		Fighter ryu = new Fighter("Ryu", 20, 95, 100, 15);
		Ring r = new Ring(ken, ryu, 90, 100, 50);
		r.run();
	}
}
