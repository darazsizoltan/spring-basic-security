package com.dz.springbasicsecurity.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @SequenceGenerator(name = "role_id_seq", sequenceName = "ROLE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq")
    private Long id;

    private String roleName;

}
