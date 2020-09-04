package com.manas.AirlineApp;

import java.util.Scanner;

public class Airline 
{
	//Array of seats
	boolean[] flightSeats = new boolean[11];
	Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Airline airline=new Airline();
		System.out.println("Welcome to Air~Asia");
		airline.start();
	}

	public void start()
	{   
		while ( true )
		{
			bookSeat();
	    }   
	}
	  

	// Function for booking a seat in reservtion system
	public void bookSeat()
	{
		//Asks user for his preffered class to travel
	    System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class:");
	    int pessangerClass = scn.nextInt();
	    if ( pessangerClass == 1 )
	    {
	    	firstClassBooking();
	    }
	    else
	    {
	        economyClassBooking();
	    }
	}

	// Check and book for first class seating
	public void firstClassBooking()
	{
		for ( int count = 1; count <= 5; count++ )
	    {
			//check if seat is available to allocate to user booking.
	        if ( flightSeats[count] == false )
	        {
	        	//book seat
	            flightSeats[count] = true;
	            System.out.println("First Class Seat Booking: Seat# "+ count);
	            break;
	        }
	        else if ( flightSeats[5] == true )
	        {
	        	if ( flightSeats[10] == true)
	            {
	        		//if both classes are fully booked
	                System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
	            }
	            else
	            {
	            	// provide pessanger another available class option
	                System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? (y/n)");
	                String option = scn.next();
	                if ( option.equalsIgnoreCase("y") )
	                {
	                	economyClassBooking();
	                    start();
	                }
	                else
	                {
	                    System.out.println("Next flight is scheduled in '3' hours.");
	                    System.exit(0);
	                }
	            }
	        }
	    }
	}   

	// Check and book for economy class seating
	public void economyClassBooking() // assign an economy seat
	{
		for ( int count = 6; count <= 10; count++ )
	    {
			if ( flightSeats[count] == false )
	        {
				flightSeats[count] = true;
	            System.out.println("economy class seat booking :# "+ count);
	            break;
	        }
	        else if ( flightSeats[10] == true )
	        {
	            if ( flightSeats[5] == true)
	            {
	                System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
	                System.exit(0);
	            }
	            else
	            {
	                System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? (y/n)");
	                String option = scn.next();
	                if ( option.equalsIgnoreCase("y") )
	                {
	                    firstClassBooking();
	                    start();
	                }
	                else
	                {
	                    System.out.println("Next flight is scheduled in 3 hours");
	                    System.exit(0);
	                }
	            }
	        }
	    }
	}

}
