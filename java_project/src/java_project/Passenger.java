package java_project;

public class Passenger {
    private static int idCounter;
    private static int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private static Address address;

    private static class Contact {
        String name, ph_no, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.ph_no = phone;
            this.email = email;
        }
    }
    private static Contact contact;

    static {
        idCounter = 0;
    }

    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getId() {
        return this.id;
    }
    public static String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public static String getContactDetails() {
        return contact.name + ", " + contact.ph_no + ", " + contact.email;
    }
    public static int getPassengerCount(){
        return id;
    }
}