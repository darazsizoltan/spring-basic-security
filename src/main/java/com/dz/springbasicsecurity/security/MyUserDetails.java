package com.dz.springbasicsecurity.security;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MyUserDetails implements UserDetails {

    private String userName;
    private String lastName;
    private String familyName;
    private Boolean active;
    private String password;
    private List<GrantedAuthority> grantedAuthorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGrantedAuthorities(List<GrantedAuthority> grantedAuthorities) {
        this.grantedAuthorities = grantedAuthorities;
    }
}
