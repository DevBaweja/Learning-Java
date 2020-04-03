
public class DemoCountry {

	public static void main(String[] args) {
		
		Country A = new Country();
		System.out.println("For country A");
		A.showData();
		A.readData();
		A.showData();
		
		Country B = new Country("india","delhi","modi","raj","jai","dev","bik",254);
		B.showData();
	}

}
