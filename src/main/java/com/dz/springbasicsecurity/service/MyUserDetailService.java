package com.dz.springbasicsecurity.service;

import com.dz.springbasicsecurity.entity.User;
import com.dz.springbasicsecurity.mapper.UserMapper;
import com.dz.springbasicsecurity.repository.UserRepository;
import com.dz.springbasicsecurity.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Optional<User> byUserName = userRepository.findByUserNameAndActiveIsTrue(username);
        return byUserName.map(user -> userMapper.userToMyUserDetails(user)).orElse(null);
    }
}
