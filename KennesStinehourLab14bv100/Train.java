//Kennes and Stinehour version of the train class
//This class takes data from KennesStinehourLab14bv100.java and uses it to form a train

import java.util.ArrayList;
import java.awt.*;
import java.applet.*;

public class Train extends Applet
{

ArrayList<RailCar> railCars = new ArrayList<RailCar>(); //dynamic array for the railcars to be put into

ArrayList<RailCar> passengerCars = new ArrayList<RailCar>(); //dynamic array for all the passengercars to be put into

ArrayList<RailCar> freightCars = new ArrayList<RailCar>();//dynamic array for all the freightcars to be put into

ArrayList<RailCar> cabooseCars = new ArrayList<RailCar>();//dynamic array for all the caboosecars to be put into

private int x;               //starting x coordinate
private int y;               //starting y coordinate
private int h = 100;         //used to start the x coordinate for the passengercar array
private int j = 100;         //used to start the x coordinate for the freightcar array
private int k = 100;         //used to start the x coordinate for the caboosecar array


   
   public Train(int x, int y) //the x and y coordinates from the original lab class and brought in
   {
      this.x = x;
      this.y = y;
   
   }
   
   public void addCar(String type, Color color)   //this method adds a railcar to the array (not overloaded)
   {
      int arrayPosition;
      arrayPosition = ((railCars.size()*175) + x); //this will change the x coordinate for every railcar added
      String name;
      Color colour;
   
      name = type;
      colour = color;
      
      for(int g = 0;g < 10;g++)  //adds 10 passengercars to the passengercar array
         {
            
            PassengerCar passengercars = new PassengerCar(Color.gray,h,y);
            passengerCars.add(passengercars);
            h += 175;
         }
         
      for(int g = 0;g < 10;g++)  //adds 10 freightcars to the freightcar array
         {
            FreightCar freightcars = new FreightCar(Color.green,j,y);
            freightCars.add(freightcars);
            j += 175;
         }
         
      for(int g = 0;g < 10;g++)  //adds 10 caboosecars to the caboosecar array
         {
            Caboose caboosecars = new Caboose(Color.red,k,y);
            cabooseCars.add(caboosecars);
            k += 175;
         }
   
   if (name.equals("Locomotive") == true) //checks to see if the railcar will be a locomotive
   {
      Locomotive locomotive = new Locomotive(colour,arrayPosition,y);
      railCars.add(locomotive);         
   }
   
   if (name.equals("PassengerCar") == true) //checks to see if the railcar will be a passengercar
   {
      PassengerCar passengercar = new PassengerCar(colour,arrayPosition,y);
      railCars.add(passengercar);
   }
   
   if (name.equals("FreightCar") == true) //checks to see if the railcar will be a freightcar
   {
      FreightCar freightcar = new FreightCar(colour,arrayPosition,y);
      railCars.add(freightcar);
   }
   
   if (name.equals("Caboose") == true) //checks to see if the railcar will be a caboose
   {
      Caboose caboose = new Caboose(colour,arrayPosition,y);
      railCars.add(caboose);
  }
 } 
  public void addCar(int position, String type, Color color)   //this method adds a railcar to the array and is overloaded
   {
      int arrayNum = position;
      String name = type;
      Color colour = color;
      int arrayPosition = ((arrayNum*175) + x); //this will change the x coordinate for every railcar added
      
            
      
         
   if (name.equals("Locomotive") == true) //checks to see if the railcar will be a locomotive
   {
      Locomotive locomotive = new Locomotive(colour,arrayPosition,y); 
      railCars.add(arrayNum, locomotive);
   }
   
   if (name.equals("PassengerCar") == true) //checks to see if the railcar will be a passengercar
   {
      PassengerCar passengercar = new PassengerCar(colour,arrayPosition,y);
      RailCar g = freightCars.get(arrayNum+1); //this will move the frieghtcar we need to move one car position to the right
      railCars.set(arrayNum, g);
      railCars.add(arrayNum, passengercar);
   }
   
   if (name.equals("FreightCar") == true) //checks to see if the railcar will be a freightcar
   {
      FreightCar freightcar = new FreightCar(colour,arrayPosition,y);
      RailCar h = cabooseCars.get(arrayNum+1); //this will move the caboosecar we need to move one car position to the right
      railCars.set(arrayNum, h);
      railCars.add(arrayNum, freightcar);
   }
   
   if (name.equals("Caboose") == true) //checks to see if the railcar will be a caboose
   {
      Caboose caboose = new Caboose(colour,arrayPosition,y);
      railCars.add(arrayNum, caboose);
   }
   }
 
   public void showCars(Graphics g) //this method prints out the railcars that have been stored in the dynamic array
   {
      for (RailCar railCar : railCars)
            railCar.drawCar(g);
   
   }






}