package com.jay.maven.lombok.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String email;
}
