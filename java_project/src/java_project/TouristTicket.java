package java_project;

public class TouristTicket extends Ticket {

        private String hotelAddress;
        private String touristLocation;

    public TouristTicket(int PNR_no, String departureLocation, String destinationLocation, String flightName, String dateDeparture, String timeDeparture, String dateArrival, String timeArrival, String passengerDetails, int seatNo, float price, boolean activeTicket,String hotelAddress,String turistLocation) {
        super(PNR_no, departureLocation, destinationLocation, flightName, dateDeparture, timeDeparture, dateArrival, timeArrival, passengerDetails, seatNo, price, activeTicket);
        this.hotelAddress = hotelAddress ;
        this.touristLocation = touristLocation;

    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }


}
