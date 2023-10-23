package info.cellardoor.bankaccountservice.controllers;

import info.cellardoor.bankaccountservice.entities.BankAccount;
import info.cellardoor.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class AccountsController {
    private final BankAccountRepository bankAccountRepository;
    public AccountsController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    @GetMapping(path = "/bankAccounts")
    public List<BankAccount> allAccounts() {
        return bankAccountRepository.findAll();
    }
    @GetMapping("/bankAccounts/{id}")
    public BankAccount getAccount(@PathVariable String id) {
        return bankAccountRepository.findById(id).get();
    }

}