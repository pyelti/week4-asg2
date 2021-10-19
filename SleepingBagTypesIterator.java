import java.util.Iterator;
  
public class SleepingBagTypesIterator implements Iterator<SleepingBagType>, SleepingBagTypesIteratorInterface {
	SleepingBagType[] list;
	int position = 0;
 
	public SleepingBagTypesIterator(SleepingBagType[] list) {
		this.list = list;
	}
 
	@Override
	public SleepingBagType next() {
		SleepingBagType sleepingBagTypes = list[position];
		position = position + 1;
		return sleepingBagTypes;
	}
 
	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
 
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an type until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}