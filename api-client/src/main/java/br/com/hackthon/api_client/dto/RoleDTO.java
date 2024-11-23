package br.com.hackthon.api_client.dto;

import br.com.hackthon.api_client.entities.*;
import br.com.hackthon.api_client.validation.*;
import com.fasterxml.jackson.annotation.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.hateoas.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class RoleDTO extends RepresentationModel<RoleDTO> {

    public interface RoleView{
        public static interface RegistrationPost { }
        public static interface RolePut { }
    }

    private UUID id;

    @Size(min = 4, max = 70, message = "Minimum characters 4 and maximum 70.")
    @NotNull(message = "The authority field is mandatory.")
    @AuthorityConstraint(message = "Invalid authority, already exists.")
    @JsonView({RoleView.RegistrationPost.class, RoleView.RolePut.class})
    private String authority;

    public RoleDTO() {
    }

    public RoleDTO(UUID id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public RoleDTO(Role entity) {

        id = entity.getId();
        authority = entity.getAuthority();
    }
}

