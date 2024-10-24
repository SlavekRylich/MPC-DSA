package pakets;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Packet paket1 = new Packet();
		Packet paket2 = new Packet();
		Packet paket3 = new Packet();
		Packet paket4 = new Packet();
		Packet paket5 = new Packet();
		
		paket1.nextPacket = paket2;
		paket2.nextPacket = paket3;
		
		paket3.nextPacket = paket4;
		
		paket4.nextPacket = paket5;
		
		paket5.nextPacket = paket1;
		
		
		

	}

}
