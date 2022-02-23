package Encapsulation;

public class Printer {
	private int tonnerLevel;
	private int pagePrinted;
	private boolean duplex;
	
	public Printer(int tonnerLevel, boolean duplex) {
		if(this.tonnerLevel >-1 && this.tonnerLevel < 100) {
			this.tonnerLevel = tonnerLevel;
		}else {
			this.tonnerLevel = -1;
		}
		
		this.pagePrinted = 0;
		this.duplex = duplex;
	}
	
	public int fillUp(int ink) {
		if(ink > 0 && ink < 100) {
			if(this.tonnerLevel+ink >100) {
				return -1;
			}
			this.tonnerLevel+=ink;
			return this.tonnerLevel;
		}else {
			return -1;
		}
	}
	
	public int Printing(int pages) {
		if(this.duplex) {
			pages = (pages/2)+(pages%2);
			System.out.println("Printing in duplex mode.");
		}
		this.pagePrinted+=pages;
		return pages;
	}

	public int getPagePrinted() {
		return pagePrinted;
	}
	
	

}
