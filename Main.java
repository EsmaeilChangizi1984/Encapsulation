package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50,true);
		System.out.println("Initial pages count is "+printer.getPagePrinted());
		//printer.Printing(5);
		System.out.println("printed pages was "+printer.Printing(4)+" new count is "+printer.getPagePrinted());
		
	}

}
