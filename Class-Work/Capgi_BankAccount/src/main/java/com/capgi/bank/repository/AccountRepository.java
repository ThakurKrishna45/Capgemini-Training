package com.capgi.bank.repository;

import com.capgi.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

//    Derived Query
//    Account findByHolderEmail(String holderEmail);
//    List<Account> findByAccountType();
//    Account findByEmailAndPassword(String Email, String Password);
//
////    JPQL Queries
//    @Query("SELECT a from account a where AccountType= :type")
//    List<Account> getAccountsByType(@Param("type")String type);
//
//
////  Native Query
//    @Query(value = "Select * from account where accountType=:type",nativeQuery = true)
//    List<Account> findByTypeNative(@Param("type")String type);
}
