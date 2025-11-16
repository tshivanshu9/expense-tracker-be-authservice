package org.example.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.entities.UserInfo;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class UserInfoDto extends UserInfo {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotNull
    private Long phoneNumber;

    @NotBlank
    private String email;
}
