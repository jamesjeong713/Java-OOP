package lab3;

import edu.ac.guitarlib.Midi;

public class SimpleSong {
	
   public static void main(String args[]) {
	   
       Guitar guitar = new Guitar();
       //Start playing guitar
       for (int i=0; i<6; i++) 
       {
    	   guitar.pluck(i+1);
    	   Midi.pause(1); // pauses 1 second
       }
       
       Midi.pause(4); // pauses 4 seconds
       guitar.pluck(4);
       Midi.pause(2);
       guitar.turn(5,2);
       guitar.pluck(3);
       Midi.pause(2);
       guitar.turn(5,2);
       guitar.pluck(5);
       Midi.pause(2);
       guitar.turn(4, -2);
       guitar.pluck(4);
       Midi.pause(2);
       guitar.turn(4,-2);
       guitar.pluck(2);
       Midi.pause(2);
       guitar.turn(4,1);
       guitar.pluck(3);
       Midi.pause(2);
       guitar.turn(4, -2);
       guitar.pluck(4);
       Midi.pause(2);
       guitar.turn(4,-2);
       guitar.pluck(2);
       Midi.pause(2);
       guitar.turn(4,1);
       guitar.pluck(3);
       Midi.pause(2);
       guitar.close();
   }
}
