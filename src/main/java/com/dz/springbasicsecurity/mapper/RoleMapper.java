package com.dz.springbasicsecurity.mapper;

import com.dz.springbasicsecurity.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(source = "roleName", target = "role")
    SimpleGrantedAuthority roleToGrantedAuthority(Role role);
}
