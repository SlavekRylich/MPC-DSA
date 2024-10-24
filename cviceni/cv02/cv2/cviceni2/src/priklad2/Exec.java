package priklad2;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packet p1 = new Packet();
		Packet p2 = new Packet();
		Packet p3 = new Packet();
		Packet p4 = new Packet();
		
		p1.setNextPacket(p2);
		p2.setNextPacket(p3);
		p3.setNextPacket(p4);
		
		

	}

}
