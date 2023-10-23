package info.cellardoor.bankaccountservice.controllers.https.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    @JsonProperty("AccountId")
    private String id;
    @JsonProperty("Balence")
    private Double balence;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("AccountType")
    private String accountType;
    @JsonProperty("AccountCreationDate")
    private String createdAt;
}