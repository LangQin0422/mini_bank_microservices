package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    /**
     * Find the account by customer id.
     * @param customerId - Long of the customer id
     * @return Optional<Accounts> of the target account
     */
    Optional<Accounts> findByCustomerId(Long customerId);

    /**
     * Delete the account by customer id.
     * @param customerId - Long of the customer id
     */
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}
