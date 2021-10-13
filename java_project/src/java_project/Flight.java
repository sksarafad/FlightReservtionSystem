package java_project;

public class Flight {
    private int flightNo;
    private String airlineOfFlight;
    private int capacityOfFlight;
    private int seatsBooked;
    Ticket ticket = new Ticket(141,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true);
    RegularTicket regularTicket = new RegularTicket(141,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true,"food");

    public Flight(int flightNo,String airlineOfFlight,int capacityOfFlight,int seatBooked){
        this.flightNo = flightNo;
        this.airlineOfFlight = airlineOfFlight;
        this.capacityOfFlight = capacityOfFlight;
        this.seatsBooked = seatBooked;
    }

    public Flight(Flight flight){
        this.flightNo = flight.flightNo;
        this.airlineOfFlight = flight.airlineOfFlight;
        this.capacityOfFlight = flight.capacityOfFlight;
        this.seatsBooked = flight.seatsBooked;
    }
    public String getFlightDetails(){
        return  airlineOfFlight;
    }
    public boolean isSeatAvailable(){
        if((capacityOfFlight - seatsBooked )>0)
            return true;
        else
            return  false;
    }
    public void updateSeats(){
        if(ticket.activeTicket){
            seatsBooked++;
        }
    }

    public int getFlightNo() {

        return flightNo;
    }

    public void setFlightNo(int flightNo) {

        this.flightNo = flightNo;
    }

    public String getAirlineOfFlight() {

        return airlineOfFlight;
    }

    public void setAirlineOfFlight(String airlineOfFlight) {

        this.airlineOfFlight = airlineOfFlight;
    }

    public int getCapacityOfFlight() {
        return capacityOfFlight;
    }

    public void setCapacityOfFlight(int capacityOfFlight) {

        this.capacityOfFlight = capacityOfFlight;
    }

    public int getSeatBooked() {
        return seatsBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatsBooked = seatBooked;
    }
}
