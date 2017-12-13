
public class Disk implements Comparable<Disk> {
	private int radius;
	public Disk() {
		radius = 0;
	}
	public Disk(int r) {
		if(r<0)
			throw new IllegalArgumentException();
		radius = r;
	}
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
	public int getRadius() {
		return radius;
	}
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
