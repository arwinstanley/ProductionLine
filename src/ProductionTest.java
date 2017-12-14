	/**
	 * @author arwinstanley
	 * @Date 12/13/17
	 * This class is used to test ProductionLine
	 */
public class ProductionTest {
	public static void main(String args[]) {
		System.out.println("================== Disk Test ==================");
		Disk d1 = new Disk();
		Disk d2 = new Disk(3);
		//Disk d3 = new Disk(-1); //throws an IllegalArgumentException as intended 
		Disk d3 = new Disk(798);
		System.out.println("Default Constructor Test");
		System.out.println(d1);
		System.out.println("Expected result: '*' ");
		System.out.println();
		System.out.println("One var Constructor Test");
		System.out.println(d2);
		System.out.println("Expected result: '******' ");
		System.out.println();
		System.out.println("EXTREME Constructor Test");
		System.out.println(d3);
		System.out.println("Expected result: Crazy Big (2*798) ");
		System.out.println();
		System.out.println("Comparator Test");
		System.out.println(d1.compareTo(d3));
		System.out.println("Expected result: '-1' ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("================== Tower Test ==================");
		Tower t1 = new Tower();
		Tower t2 = new Tower(); //right side up 4 stack
		Tower t3 = new Tower(); //upside down 4 stack
		Tower t4 = new Tower(); //upside down 4 stack to be used to test flip
		for(int i = 4; i >0; i--) {
			t2.add(new Disk(i));
		}
		for(int i = 1; i < 5; i++) {
			t3.add(new Disk(i));
			t4.add(new Disk(i));
		}
		System.out.println("Default Constructor Test");
		System.out.println(t1);
		System.out.println("Expected result: ");
		System.out.println();
		System.out.println("Right side up 4 stack Test");
		System.out.println(t2);
		System.out.println("Expected result:");
		System.out.println("   **   \n" + "  ****  \n"+" ****** \n"+"********");
		System.out.println();
		System.out.println("Upside down 4 stack Test"); //still aligns left but this one is redundant so it doesen't matter as much
		System.out.println(t3);
		System.out.println("Expected result:");
		System.out.println("********\n******\n****\n**\n");
		System.out.println();
		System.out.println("Flip method Test");
		System.out.println(t4.flipTower());
		System.out.println("Expected result:");
		System.out.println("   **   \n" + "  ****  \n"+" ****** \n"+"********");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("================== ProductionLine Test ==================");
		ProductionLine test = new ProductionLine();
		for(int i = 1; i < 5; i++) {
			test.addDisk(new Disk(i));
		}
		test.process();
		System.out.println("Default easy-mode Tower");
		System.out.println(test.removeTower());
		System.out.println("Expected result:");
		System.out.println("   **   \n" + "  ****  \n"+" ****** \n"+"********");
		System.out.println();
		test.addDisk(new Disk(4));
		test.addDisk(new Disk(1));
		test.addDisk(new Disk(2));
		test.process();
		System.out.println("Two at one time test");
		System.out.println(test.removeTower());
		System.out.println(test.removeTower());
		System.out.println("Expected result:");
		System.out.println("********\n");
		System.out.println(" ** \n" + "****\n");
}  
}
