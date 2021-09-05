package com.dz.springbasicsecurity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @SequenceGenerator(name = "user_id_seq", sequenceName = "USER_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Long id;

    private String userName;
    private String familyName;
    private String lastName;
    private String password;
    private Boolean active;

    @OneToMany
    private Set<Role> role;

}
