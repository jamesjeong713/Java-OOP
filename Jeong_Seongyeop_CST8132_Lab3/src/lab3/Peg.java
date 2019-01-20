package lab3;

public class Peg {
	
	//variable 
	private Wire wire;
	//constructor
	public Peg(Wire wire)
	{
		//put wire variable in object array wire 
		this.wire = wire;
	}
	
	public void turn(int deltaTension)
	{
		//control the deltaTension variable in changeTension method
		wire.changeTension(deltaTension);
	}
}
