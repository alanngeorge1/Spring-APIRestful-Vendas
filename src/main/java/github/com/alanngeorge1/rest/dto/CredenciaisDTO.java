package github.com.alanngeorge1.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CredenciaisDTO {
    private String login;
    private  String senha;

}
