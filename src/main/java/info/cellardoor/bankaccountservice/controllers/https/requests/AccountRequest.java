package info.cellardoor.bankaccountservice.controllers.https.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
    private String id;
    private Double balence;
    private String currency;
    private String accountType;
    private String createdAt;
}