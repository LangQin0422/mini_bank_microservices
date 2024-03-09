package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create account.
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetch an account by mobileNumber.
     * @param mobileNumber - the target number in String
     * @return a CustomerDto contains the info of the target account
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Update an account.
     * @param customerDto - CustomerDto object
     * @return a boolean value indicates the success of the update
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Delete an account by mobileNumber.
     * @param mobileNumber - the target number in String
     * @return a boolean value indicates the success of the delete
     */
    boolean deleteAccount(String mobileNumber);
}
