package apurva;

class Browser {

	void displayBrowserInfo(String browser) {
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge"))
			System.out.println("Valid Browser");
		else if (browser.equals("Safari") || browser.equals("FF"))
			System.out.println("Invalid Browser");
	}

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.displayBrowserInfo("Chrome");
		browser.displayBrowserInfo("Safari");
	}
}