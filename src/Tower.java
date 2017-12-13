
import java.util.Stack;
public class Tower extends Stack<Disk> {
	public Tower() {
		super();
	}
	public void stackDisk(Disk x) {
		push(x);
	}
	public Tower flipTower() {
		Tower flipped = new Tower();
		while (!(isEmpty())) {
			flipped.add(this.pop());
		}
		return flipped;
	}
}
