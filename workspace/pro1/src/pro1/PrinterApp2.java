package pro1;

public class PrinterApp2 {

	public static void main(String[] args) {
		
		ColorPrinter p1 = new ColorPrinter();
		
		((Printer) p1).feed();
		((Printer) p1).print("내용");
		
		// ColorPrinter p2 = new Pirnter(); 에러다. 

	}

}
