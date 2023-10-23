package info.cellardoor.bankaccountservice;

import info.cellardoor.bankaccountservice.entities.BankAccount;
import info.cellardoor.bankaccountservice.enums.AccountType;
import info.cellardoor.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository) {
		return args -> {
			for (int i=0; i<10; i++)
			{
				BankAccount bankAccount=BankAccount.builder()
						.id(String.valueOf(i+1))
						.balence(1000+Math.random()*9000)
						.type(AccountType.valueOf(Math.random()>0.5?"CURRENT_ACCOUNT":"SAVINGS_ACCOUNT"))
						.currency("MAD")
						.createdAt(new java.util.Date())
						.build();
				bankAccountRepository.save(bankAccount);
			}
		};
	}

}