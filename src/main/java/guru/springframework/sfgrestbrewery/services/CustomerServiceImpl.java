package guru.springframework.sfgrestbrewery.services;

import guru.springframework.sfgrestbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(Integer customerId) {
        return CustomerDto.builder()
                .id(new Random().nextInt())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(new Random().nextInt())
                .build();
    }

    @Override
    public void updateCustomer(Integer customerId, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    @Override
    public void deleteById(Integer customerId) {
        log.debug("Deleting.... ");
    }
}
