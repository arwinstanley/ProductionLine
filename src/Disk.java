	/**
	 * @author arwinstanley
	 * @Date 12/13/17
	 * This class is used to represent a "Disk" with one field its radius
	 */
public class Disk implements Comparable<Disk> {
	private int radius;
	/**
	* 
	* creates a default Disk with a radius of 0
	* 
	* @param none
	* @return none
	*/
	public Disk() {
		radius = 0;
	}
	/**
	* 
	* creates a Disk with the radius r
	* 
	* @param r is the radius of the disk
	* @return none
	*/
	public Disk(int r) {
		if(r<0)
			throw new IllegalArgumentException();
		radius = r;
	}
	/**
	* 
	* returns an String that shows what the object is
	* 
	* @param none
	* @return a String visualization of the Disk as 2*r of "*" or if the radius is 0 then just "*"
	*/
	public String toString() {
		String out = "";
		if(radius != 0) {
			for(int i = 0; i < radius; i++)
				out += "**";
		}
		else {
			out = "*";
		}
		return out;
	}
	/**
	* 
	* returns the radius
	* 
	* @param none
	* @return radius of the Disk
	*/
	public int getRadius() {
		return radius;
	}
	/**
	* 
	* returns an int representation of the difference between 'this' and 'other'
	* 
	* @param other is the Disk you want to compare
	* @return an int representation of the difference between 'this' and 'other'
	*/
	public int compareTo(Disk other){
		if( radius == other.getRadius()){
			return 0;
		}
		else if(radius>other.getRadius()) {
			return 1;
		}
		return -1;
	}
}
