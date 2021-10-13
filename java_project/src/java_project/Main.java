package java_project;

public class Main {
    public static void printTicketDetails(Ticket ticket){

        RegularTicket regularTicket = new RegularTicket(141,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true,"food");
        System.out.println(regularTicket.PNR_no);
        TouristTicket touristTicket = new TouristTicket(140,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true,"delhi","bazar");
        System.out.println(touristTicket.PNR_no);
    }
    public static void main(String[] args){

        RegularTicket regularTicket = new RegularTicket(141,"kolkata","delhi","Arind","10oct","8","10oct","10","regular",45,1000.00f,true,"food");
        TouristTicket touristTicket = new TouristTicket(140,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true,"delhi","bazar");
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);



        Flight AirIndia = new Flight(111,"AirIndia",100,50);
        Passenger passenger = new Passenger("nungi","kolkata","wb","raj","9038956874","raj@gmail.com");
       // int PNR_no, String departureLocation, String destinationLocation, String flightName, String dateDeparture, String timeDeparture, String dateArrival, String timeArrival, String passengerDetails, int seatNo, float price, boolean activeTicket, Flight flight, Passenger passenger
        Ticket ticket = new Ticket(141,"kolkata","delhi","Arind","10oct","8","10oct","10","tourist",45,1000.00f,true);
       // System.out.println(ticket.PNR_no);

    }

}
