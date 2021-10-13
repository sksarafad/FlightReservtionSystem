package java_project;

public class Ticket {

    public int PNR_no;
    private String departureLocation;
    private String destinationLocation;
    private String flightName;
    private String dateDeparture;
    private String timeDeparture;
    private String dateArrival;
    private String timeArrival;
    private String passengerDetails;
    private int seatNo;
    private float price;
    public boolean activeTicket;
    private Flight flight;
    private Passenger passenger;

    public Ticket(int PNR_no, String departureLocation, String destinationLocation, String flightName, String dateDeparture, String timeDeparture, String dateArrival, String timeArrival, String passengerDetails, int seatNo, float price, boolean activeTicket, Flight flight, Passenger passenger) {
        this.PNR_no=PNR_no;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flightName = flightName;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.dateArrival = dateArrival;
        this.timeArrival = timeArrival;
        this.passengerDetails = passengerDetails;
        this.seatNo = seatNo;
        this.price = price;
        this.activeTicket = activeTicket;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Ticket(int PNR_no, String departureLocation, String destinationLocation, String flightName, String dateDeparture, String timeDeparture, String dateArrival, String timeArrival, String passengerDetails, int seatNo, float price, boolean activeTicket) {
        this.PNR_no = PNR_no;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flightName = flightName;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.dateArrival = dateArrival;
        this.timeArrival = timeArrival;
        this.passengerDetails = passengerDetails;
        this.seatNo = seatNo;
        this.price = price;
        this.activeTicket = activeTicket;
    }

    public int getPNR_no(){
        return PNR_no;
    }

    public void setPNR_no(int PNR_no) {
        this.PNR_no = PNR_no;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }





    public String ticketStatus(){

        if (activeTicket == true)
            return "confirm";
        else
            return "cancel";
    }
    public int journeyDuration(){

        int r = 0,t = 0;

        r = Integer.parseInt(String.valueOf(timeArrival));
        t =Integer.parseInt(String.valueOf(timeDeparture));
        return (t-r);
    }
    public boolean cancelTicket(){
       return (activeTicket = false);
    }


    private static RegularTicket regularTicket;


    public void printTicketDetails() {

    }
}
