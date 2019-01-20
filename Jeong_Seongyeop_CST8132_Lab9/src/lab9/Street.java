package lab9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * This class is to draw graphic user interface,
 * and it is also to simulate and sort order of vehicles.
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public class Street extends JFrame implements SimInterface {
	 
	private static final long serialVersionUID = 1L;
	// JLabels should be used instead of JTextfield because it is for input text
	private JLabel promptJLabel;
	private JLabel messageJLabel;
	private JLabel addExplainJLabel;
	private JPanel messageJPanel;
	// Jbuttons
	private JButton addCarJButton;
	private JButton addBicycleJButton;
	private JButton addTricycleJButton;
	private JButton doneJButton;
	// Color
	private Color background;
	private Color buttonColor;
	private Color backgroundOfMessage;
	// JPanel
	private JPanel buttonPanel = new JPanel();
	private ButtonHandler buttonHandler = new ButtonHandler();	
	// Random Numbers is to choose vehicles randomly
	private static final Random RANDOM_NUMBERS = new Random();
	// ArrayList for Vehicle
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	// this class is for receiving action events from user.
	// it is already declared in reference
	private class ButtonHandler implements ActionListener { 

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == addCarJButton) {
				// instantiate Car instance 
				Car c = new Car();
				// add the instance of Car to ArrayList<Vehicle>
				vehicles.add(c);
				// update message with car
				messageJLabel.setText(c.VEHICLE_NAME + " was added.");
				// to call paint method as soon as possible when the component is a lightweight.
				repaint();
			} 
			else if (event.getSource() == addBicycleJButton)
			{
				// instantiate Bicycle instance 
				Bicycle b = new Bicycle();
				// add the instance of Bicycle to ArrayList<Vehicle>
				vehicles.add(b);
				// update message with Bicycle
				messageJLabel.setText(b.VEHICLE_NAME + " was added.");
				// to call paint method as soon as possible when the component is a lightweight.
				repaint();
			}
			else if (event.getSource() == addTricycleJButton)
			{
				// instantiate Tricycle instance 
				Tricycle t = new Tricycle();
				// add the instance of Tricycle to ArrayList<Vehicle>
				vehicles.add(t);
				// update message with Tricycle
				messageJLabel.setText(t.VEHICLE_NAME + " was added.");
				// to call paint method as soon as possible when the component is a lightweight.
				repaint();
			}
			else {
				// when user click done button, start to simulate
				simulate();
				// close Jframe / end application to reduce memory.
				System.exit(0);
			}
		}
		
	}	
	// constructor 
	public Street() {
			// show "Vehicle GUI" on the task bar
			super("Vehicle GUI");
			
			// to create window size
			int width = 450;
			int labelHeight = 80;
			int buttonPanelHeight = 100;
			int totalHeight = buttonPanelHeight + 2 * labelHeight;
			
			// set frame layout
			setLayout(new FlowLayout());
			
			background = Color.green; // set background to orange
			buttonColor = Color.yellow; // set yellow color between buttons 
			backgroundOfMessage = Color.white;
			
			promptJLabel = new JLabel("Click a button to add a vehicle.", JLabel.CENTER); // describe game		
			promptJLabel.setPreferredSize(new Dimension(width,labelHeight)); // set the size of Label
			add(promptJLabel); // add promptJLabel component to the container
			
			// set the button "Car"
			// reference_https://pngtree.com/so/cartoon-car
			addCarJButton = new JButton("Add Car");

			addBicycleJButton = new JButton("Add Bicycle");
			addTricycleJButton = new JButton("Add Tricycle");
			doneJButton = new JButton("Done");
			
			// implement ButtonHandler class with action listener 
			// it makes connected to each buttons
			addCarJButton.addActionListener(buttonHandler);
			addBicycleJButton.addActionListener(buttonHandler);
			addTricycleJButton.addActionListener(buttonHandler);
			doneJButton.addActionListener(buttonHandler);
			// set the size of button by JPanel 
			buttonPanel.setSize(width, buttonPanelHeight);
			
			/* GridLayout (row, column, horizon, and vertical)
			 * before you set up the set layout, you should think about gaps of horizon and vertical
			 * to improve user's experience */
			buttonPanel.setLayout(new GridLayout(2, 2, 10, 0));
			
			// set the button "Car"
			// reference_https://pngtree.com/so/cartoon-car
			buttonPanel.add(addCarJButton); // add JPanel.addCarJButton to JPanel				
			buttonPanel.add(addBicycleJButton); // add JPanel.addBicycleJButton to JPanel
			buttonPanel.add(addTricycleJButton); // add JPanel.addTricycleJButton to JPanel
			buttonPanel.add(doneJButton); // add JPanel.doneJButton to JPanel
			add(buttonPanel); // add buttonPanel to JFrame
			
			// JLabel constructor with title and alignment
			messageJPanel = new JPanel();
			messageJPanel.setLayout(new GridLayout(2, 1, 10, 0));
			
			messageJLabel = new JLabel("Vehicle name appears here.", JLabel.CENTER); 
			messageJLabel.setPreferredSize(new Dimension(width, 30)); // set the message Label's size
			messageJPanel.add(messageJLabel); // add messageJLabel to JFrame
			
			// JLabel constructor with title and alignment on the end of window
			addExplainJLabel = new JLabel
					("Vehicle which is faster than another will be first in ordering", JLabel.CENTER);
			addExplainJLabel.setForeground(Color.red); // set color of the Label
			addExplainJLabel.setPreferredSize(new Dimension(width, 30)); // set the message Label's size
			messageJPanel.add(addExplainJLabel); // add addExplainJLabel to JFrame

			add(messageJPanel);
			setSize(width, totalHeight); // set window size
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when the application close, the program should be closed entirely
		}

	public void simulate()
	{
		// when the size of ArrayList is 0, output "No Vehicles"
		if (vehicles.size() == 0)
		{
			System.out.println("No vehicles.");
		}
		
		// otherwise, for loop 6 times.
		else 
		{		
			for (int i = 0 ; i < 6 ; i++) 
			{
				// to explore ArrayList, we should use the iterator. 
				Iterator<Vehicle> iterator;
				// there are vehicles which is generated as random numbers 
				// as much as user makes vehicles in rand instance 
				Vehicle rand = vehicles.get(RANDOM_NUMBERS.nextInt(vehicles.size()));
				
				// ouput title
				System.out.println("Update on the street " + i + ":");
				
				// Sort list
				// call the class from second argument to pass an instance of that
				Collections.sort(vehicles, new VehicleComparator()); 
				iterator = vehicles.iterator(); // iterator is used to check stored data repeatedly 
				System.out.println("-- sorted order"); // collections sort from here
				while (iterator.hasNext())
				{
					Vehicle v = iterator.next();
					System.out.println(v.VEHICLE_NAME + ", speed: " + v.speed + ", " + v.makeNoise());
				}				
				
				// Shuffle list
				Collections.shuffle(vehicles);
				iterator = vehicles.iterator(); // I thought that it doesn't need to add it again, but it has to be added.
												// because after we use the iterator with hasnext and next().
												// the functions of the iterator is done. 
				System.out.println("-- shuffled order"); // collections sort from here
				while (iterator.hasNext())
				{
					Vehicle v = iterator.next();
					System.out.println(v.VEHICLE_NAME + ", speed: " + v.speed + ", " + v.makeNoise());
				}				
				// random number will choose number of vehicle.
				rand.pushPedal();
				System.out.println("Pedal of " + rand.VEHICLE_NAME + " was pushed");
				System.out.println();
			}
		}
	}
	
	/**
	 * this method is to draw background by calling graphics abstract.
	 * that's why we use super.paint(g).
	 * there're three kinds of set background.  
	 * background color is green, yellow color is between buttons, and background of message is white. 
	 */
	public void paint( Graphics g ) {
		super.paint( g );
		buttonPanel.setBackground( buttonColor );
		messageJPanel.setBackground(backgroundOfMessage);
		getContentPane().setBackground( background );
		
	}	
	
	/**
	 * this method is override from Siminterface class to check the strings with JUnit4
	 * if it is not matched after checking of car, tricycle and bicycle, throw exception. 
	 * and show the output. 
	 */
	@Override
	public void parse(String[] s) {
		for (String str : s) {
			try {
				if (str.equals("car")) {
					vehicles.add(new Car());
				} else if (str.equals("tricycle")) {
					vehicles.add(new Tricycle());
				} else if (str.equals("bicycle")) {
					vehicles.add(new Bicycle());
				} else {
					throw new Exception("Invalid input");
				}

			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	/**
	 * enhanced for loop is looping through the vehicle arrayList. 
	 * at each of those index holds elements are instands of subclass vehicle. 
	 * therefore, if(v instanceof Car) means that if it is Car or not to check. 
	 * and if it is right, sum = sum + v.speed
	 * this class is to support Junit4
	 */
	@Override
	public int getSumBicyleSpeeds() {
		int sum = 0;
		for (Vehicle v : vehicles)
		{
			if (v instanceof Bicycle)
				sum += v.speed;
		}
		return sum;
	}
	
	/**
	 * enhanced for loop is looping through the vehicle arrayList. 
	 * at each of those index holds elements are instands of subclass vehicle. 
	 * therefore, if(v instanceof Car) means that if it is Car or not to check. 
	 * and if it is right, sum = sum + v.speed
	 * this class is to support Junit4
	 */
	@Override
	public int getSumCarSpeeds() {
 		int sum = 0;
		for (Vehicle v : vehicles)
		{
			if (v instanceof Car)
				sum += v.speed;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Street theStreet = new Street(); 
		theStreet.setVisible(true); // make the window visible. if I don't add it, user cannot see the window.
	}
}
