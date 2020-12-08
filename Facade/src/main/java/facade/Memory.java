package facade;

public class Memory {

	public void load(long position, byte[] data) { 
		System.out.println("Address: " + position);
		System.out.println("Data: " + data);
	}
}
