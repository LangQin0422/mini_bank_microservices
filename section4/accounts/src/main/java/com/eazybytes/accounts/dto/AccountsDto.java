package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Customer"
    )
    @NotEmpty(message = "AccountNumber can not bu null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber should be 10 digits long")
    private Long accountNumber;

    @Schema(
            description = "Account Type of the Customer",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not bu null or empty")
    private String accountType;

    @Schema(
            description = "Branch Address of the Customer",
            example = "123 Main Street, New York"
    )
    @NotEmpty(message = "BranchAddress can not bu null or empty")
    private String branchAddress;
}
