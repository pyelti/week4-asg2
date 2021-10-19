import java.util.ArrayList;
import java.util.Iterator;

public interface SleepingBagMenuInterface {

	void addType(String name, String type, double price);

	ArrayList<SleepingBagType> getSleepingBagTypes();

	Iterator<SleepingBagType> createIterator();

}