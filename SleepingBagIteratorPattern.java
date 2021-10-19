import java.util.ArrayList;

public class SleepingBagIteratorPattern {
	public static void main(String []args) {
		SleepingBagMenu sleepingBagMenu=new SleepingBagMenu();
		ArrayList<SleepingBag> bags=new ArrayList<SleepingBag>();
		bags.add(sleepingBagMenu);
		SalesMen sales=new SalesMen(bags);
		sales.printSleepingBagMenu();
	}

}
