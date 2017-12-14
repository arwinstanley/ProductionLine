	/**
	 * @author arwinstanley
	 * @Date 12/13/17
	 * This class is used to represent a Robot who uses "Disks to create "Towers" of increasingly smaller disks 
	 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ProductionLine{
	private Tower invertedTower;
	private Queue<Disk> inQ;
	private Queue<Tower> outQ;
	/**
	* 
	* Creates a default Production Line and initializes the fields
	* 
	* @param none
	* @return none
	*/
	public ProductionLine(){
		inQ = new LinkedList<Disk>();
		outQ = new LinkedList<Tower>();
		invertedTower = new Tower();
	}
	/**
	* 
	* Adds a disk to the inQ
	* 
	* @param x the disk you want to add
	* @return none
	*/
	public void addDisk(Disk x) {
		inQ.add(x);
	}
	/**
	* 
	* Takes the working Tower, flips it, and places it in OutQ
	* 
	* @param none
	* @return none
	*/
	public void unloadRobot() {
		Tower newTower = invertedTower.flipTower();
		outQ.add(newTower);
		invertedTower = new Tower();
	}
	/**
	* 
	* Adds all of the Disks from inQ into Towers and then puts them in OutQ
	* 
	* @param none
	* @return none
	*/
	public void process() {
		while(!(inQ.isEmpty())) {
			
			if( invertedTower.isEmpty() || inQ.peek().compareTo(invertedTower.peek()) == 1 ) {  
				invertedTower.stackDisk(inQ.remove());
			
			}
			else {
				unloadRobot();
			}
		}
		unloadRobot();
	}
	/**
	* 
	* Removes a Tower from outQ and returns it
	* 
	* @param none
	* @return Tower the Tower you just removed from OutQ
	*/
	public Tower removeTower() {
		if(outQ.isEmpty())
			return null;
		return outQ.remove();
	}
	
}

	