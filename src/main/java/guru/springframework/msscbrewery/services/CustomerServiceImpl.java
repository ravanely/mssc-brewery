package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author ravnely
 * @project mssc-brewery
 * @Created 11/02/2022, 16:45:40, ven.
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .customerName("Kenfack Pascal")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).customerName("Dongmo Boris").build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(UUID id) {

    }
}
