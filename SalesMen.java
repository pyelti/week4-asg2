
import java.util.ArrayList;
import java.util.Iterator;

public class SalesMen {
	ArrayList<SleepingBag> bags;
	
	public SalesMen(ArrayList<SleepingBag> bags) {
		this.bags=bags;
	}
	public void printSleepingBagMenu() {
		Iterator<?> SleepingBagIterator = bags.iterator();
		while(SleepingBagIterator.hasNext()) {
			SleepingBag sleepingBag = (SleepingBag)SleepingBagIterator.next();
			printSleepingBagMenu(sleepingBag.createIterator());
		}
	}
	void printSleepingBagMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			SleepingBagType stype = (SleepingBagType)iterator.next();
			System.out.print("Name:" +stype.getName() + ", ");
			System.out.print("Type:"+stype.getType() + ", ");
			System.out.print("Price:"+stype.getPrice() + " \n");
			
		}
	}

}
