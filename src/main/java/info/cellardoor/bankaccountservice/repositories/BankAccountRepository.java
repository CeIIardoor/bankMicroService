package info.cellardoor.bankaccountservice.repositories;

import info.cellardoor.bankaccountservice.entities.BankAccount;
import info.cellardoor.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String>{
    List<BankAccount> findByType(AccountType type);
}