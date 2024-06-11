package se.lexicon.g49todoapi.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.lexicon.g49todoapi.domain.entity.Role;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTOForm {
    private String email;
    private String password;
    private Set<RoleDTOForm> roles;


}
