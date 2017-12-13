import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ProductionLine{
	private Tower invertedTower;
	private Queue<Disk> inQ;
	private Queue<Tower> outQ;
	
	public ProductionLine(){
		inQ = new LinkedList<Disk>();
		outQ = new LinkedList<Tower>();
		invertedTower = new Tower();
	}
	public void addDisk(Disk x) {
		inQ.add(x);
	}
	public void unloadRobot() {
		Tower newTower = invertedTower.flipTower();
		outQ.add(newTower);
		invertedTower = new Tower();
	}
	public void process() {
		while(!(inQ.isEmpty())) {
			Disk add = inQ.remove();
			if( invertedTower.isEmpty() || add.compareTo(invertedTower.peek()) == 1 ) {  
				invertedTower.push(add);
			}
			else {
				unloadRobot();
			}
		}
		unloadRobot();
	}
	public Tower removeTower() {
		if(outQ.isEmpty())
			return null;
		return outQ.remove();
	}
	
}

	