import java.util.ArrayList;
import java.util.Iterator;

public class SleepingBagMenu implements SleepingBag, SleepingBagMenuInterface {

	
	ArrayList<SleepingBagType> types;
	
	public SleepingBagMenu() {
		types =new ArrayList<SleepingBagType>();
		
		addType("bag1","Rectangular Shaped",800);
		System.out.println("\n");
		addType("bag2","Barrel Shaped",600);
		
		
	}

	@Override
	public void addType(String name, String type, double price)
		{
		SleepingBagType stype = new SleepingBagType(name, type, price);
		types.add(stype);
		}
		
		@Override
		public ArrayList<SleepingBagType> getSleepingBagTypes() {
		return types;
		}

		
		@Override
		public Iterator<SleepingBagType> createIterator() {
			return types.iterator();
		}


}
