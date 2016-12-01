public class DesktopApp {
	public static void main(String[] args) {
		BallMouse m = new BallMouse();
		//OpticalMouse m = new OpticalMouse();
		Desktop pc = new Desktop();
		pc.setMouse(m);

		pc.running();
		pc.painting();
		pc.cleaning();
	}
}