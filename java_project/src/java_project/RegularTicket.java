package java_project;

public class RegularTicket extends Ticket {
    private String spacialService;
    private Flight flight;
    private Passenger passenger;


    public RegularTicket(int PNR_no, String departureLocation, String destinationLocation, String flightName, String dateDeparture, String timeDeparture, String dateArrival, String timeArrival, String passengerDetails, int seatNo, float price, boolean activeTicket, String spacialService) {
        super(PNR_no, departureLocation, destinationLocation, flightName, dateDeparture, timeDeparture, dateArrival, timeArrival, passengerDetails, seatNo, price, activeTicket);
        this.spacialService = spacialService;

    }


    public String getSpacialService() {
        return spacialService;
    }

    public void setSpacialService(String spacialService) {
        this.spacialService = spacialService;
    }



}
