	/**
	 * @author arwinstanley
	 * @Date 12/13/17
	 * This class is used to represent a "Tower" of "Disks"
	 */
import java.util.Stack;
public class Tower extends Stack<Disk> {
	private int base;
	/**
	* 
	* Creates a default empty Tower
	* 
	* @param none
	* @return none
	*/
	public Tower() {
		super();
	}
	/**
	* 
	* Adds a Disk to the stack
	* 
	* @param x is a Disk to add to the stack
	* @return none
	*/
	public void stackDisk(Disk x) {
		push(x);
	}
	/**
	* 
	* Flips the tower right side up
	* 
	* @param none
	* @return flipped which is the flipped tower
	*/
	public Tower flipTower() {
		Tower flipped = new Tower();
		while (!(isEmpty())) {
			flipped.add(pop());
		}
		return flipped;
	}
	/**
	* 
	* Returns a String that shows what the object is
	* 
	* @param none
	* @return a String visualization of the tower
	*/
	public String toString() {
		if(isEmpty())
			return "";
		int plz = 0;
		Tower temp = flipTower();
		String out = "";
		int x = temp.peek().getRadius();
		while(!(temp.isEmpty())) {
			//out += pop().toString() + "\n";
			Disk test = temp.pop();
			if(!(temp.isEmpty())) {
				temp.add(test);
				Disk hold = temp.pop();
				int y = temp.peek().getRadius();
				temp.add(hold);
				String toAdd = temp.pop().toString();
				for(int i = plz;i>0;i--) {
					toAdd = " "+toAdd+" ";
				}
				out = toAdd +"\n"+ out;
				plz = x-y;
			}
			else {
				temp.add(test);
				String toAdd = temp.pop().toString();
				for(int i = plz;i>0;i--) {
					toAdd = " "+toAdd+" ";
				}
				out = toAdd +"\n"+ out;
			}
		}
		while(!(isEmpty()))
			pop();
		return out;
	}
}
