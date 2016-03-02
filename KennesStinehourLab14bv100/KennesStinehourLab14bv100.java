// KennesStinehourLab14bv100.java
// This file tests all the classes together.
// and draws a train without proper OOP design.
// This file utilizes the Train class which takes all the data and forms the train.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class KennesStinehourLab14bv100 extends Applet
{
	public void paint(Graphics g)
	{
      Train train = new Train(100,300);   //the train constuctor which allows us to pass the first railcar coordinate to the train class
      train.addCar("Locomotive",Color.blue); //all these addCar methods will add a cetain car to the train in a certain color
      train.addCar("PassengerCar",Color.gray);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar(3,"PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("Caboose",Color.red);
      train.addCar(6,"FreightCar",Color.green);
      train.showCars(g);  //this method utilizes the method in the train class to display the train

	}
}
