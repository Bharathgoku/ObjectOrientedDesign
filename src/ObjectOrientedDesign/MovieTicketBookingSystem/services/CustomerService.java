package ObjectOrientedDesign.MovieTicketBookingSystem.services;


import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Customer;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void removeCustomer(Customer customer);


}
