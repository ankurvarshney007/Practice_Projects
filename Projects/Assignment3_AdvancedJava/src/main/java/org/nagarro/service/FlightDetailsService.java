package org.nagarro.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import org.nagarro.dao.FlightDetailsDao;
import org.nagarro.model.FlightDetails;
import org.nagarro.userInput.FlightForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDetailsService {
	@Autowired
	private FlightDetailsDao flightDetailsDao;
	private final String seatAvailability = "Y";
	public void CSVFileReader() {
		this.flightDetailsDao.deleteAllFlights();
		
		File file = new File("C:\\Users\\shrishtigupta\\Downloads\\Advanced java Material\\Assignment Links\\Assignment Links");
		String[] fileNames = file.list();
		String input = null;


		for(int i =0;i<fileNames.length;i++) {
			int count =0;
			try(BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\shrishtigupta\\Downloads\\Advanced java Material\\Assignment Links\\Assignment Links"+"\\"+fileNames[i]))){
				while((input =reader.readLine())!=null) {
					if(count!=0) {
						String[] flightDetails = input.split("\\|");
						String flightNo = flightDetails[0];

						String departure = flightDetails[1];

						String arriving = flightDetails[2];
						String flightdate = flightDetails[3];

						String flightTime = flightDetails[4];
						String duration = flightDetails[5];
						double fare = Double.parseDouble(flightDetails[6]);
						String seat = flightDetails[7];
						String flightClass = flightDetails[8];
						
						FlightDetails flight = new FlightDetails();
						flight.setFlightNo(flightNo);
						flight.setDepartureLocation(departure);
						flight.setArrivalLocation(arriving);
						flight.setFlightValidTill(flightdate);
						flight.setFlightTime(flightTime);
						flight.setFlightDuration(duration);
						flight.setFlightFare(fare);
						flight.setSeatAvailability(seat);
						flight.setFlightClass(flightClass);
						flightDetailsDao.saveFlightDetails(flight);
						

					}
					count++;
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public ArrayList<FlightDetails> getAllFlightList(FlightForm flight) throws ParseException {
		
		ArrayList<FlightDetails> flightList=this.flightDetailsDao.getAllFlight();
		ArrayList<FlightDetails> flightFinalList = new ArrayList<FlightDetails>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		for(FlightDetails f:flightList) {
			
			if(f.getArrivalLocation().equalsIgnoreCase(flight.getArrivallocation()) && f.getDepartureLocation().equalsIgnoreCase(flight.getDeparturelocation()) && (sdf.parse(f.getFlightValidTill()).compareTo(sdf.parse(flight.getFlightdate()))>=0)) {
				
				if(f.getFlightClass().contains(flight.getFlightclass()) && f.getSeatAvailability().equalsIgnoreCase(seatAvailability)) {
					
					flightFinalList.add(f);
					
				}
			}
		}
		if(flight.getFlightclass().equalsIgnoreCase("B")) {
			for(FlightDetails fligth: flightFinalList) {
				fligth.setBuisnessFlightFare();
			}
		}
		
		
		if(flight.getOutputpreference().equalsIgnoreCase("sorted only by fare")) {
			Collections.sort(flightFinalList,(f1,f2)->{
				return Double.compare(f1.getFlightFare(),f2.getFlightFare()); 
			});
		}
		else {
			Collections.sort(flightFinalList,(f1,f2)->{
				if(f1.getFlightFare()==f2.getFlightFare()) {
				return f1.getFlightDuration().compareTo(f2.getFlightDuration()); }
				else {
					return Double.compare(f1.getFlightFare(),f2.getFlightFare()); 
				}
			});
		}
		
			return flightFinalList;
		
		
	}
}

