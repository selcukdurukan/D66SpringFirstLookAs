package com.ba.boost.firstprojectwithspring.model.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserRequestYeni {

    private String username;
    private String email;
    private String password;
}
