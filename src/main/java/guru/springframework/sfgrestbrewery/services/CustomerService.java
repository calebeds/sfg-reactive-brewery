package guru.springframework.sfgrestbrewery.services;

import guru.springframework.sfgrestbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(Integer customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(Integer customerId, CustomerDto customerDto);

    void deleteById(Integer customerId);
}
