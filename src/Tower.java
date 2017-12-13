	/**
	 * @author arwinstanley
	 * @Date 12/13/17
	 * This class is used to represent a "Tower" of "Disks"
	 */
import java.util.Stack;
public class Tower extends Stack<Disk> {
	/**
	* 
	* creates a default empty Tower
	* 
	* @param none
	* @return none
	*/
	public Tower() {
		super();
	}
	/**
	* 
	* adds a Disk to the stack
	* 
	* @param x is a Disk to add to the stack
	* @return none
	*/
	public void stackDisk(Disk x) {
		push(x);
	}
	/**
	* 
	* flips the tower right side up
	* 
	* @param none
	* @return flipped which is the flipped tower
	*/
	public Tower flipTower() {
		Tower flipped = new Tower();
		while (!(isEmpty())) {
			flipped.add(this.pop());
		}
		return flipped;
	}
}
