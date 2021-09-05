package com.dz.springbasicsecurity.mapper;

import com.dz.springbasicsecurity.entity.User;
import com.dz.springbasicsecurity.security.MyUserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {

    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "familyName", target = "familyName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "active", target = "active")
    @Mapping(source = "role", target = "grantedAuthorities")
    MyUserDetails userToMyUserDetails(User u);

}
