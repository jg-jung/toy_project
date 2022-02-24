package com.company.mypage.web.security.jwt.request;

import com.company.mypage.web.security.jwt.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RegistryRequest {

    private String username;
    private String password;
    private Integer age;
    private Role role;
}
