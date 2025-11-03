package com.mayzinko.accounts.service;

import com.mayzinko.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
