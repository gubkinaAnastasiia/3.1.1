package com.example.CrudBoot.service;

import com.example.CrudBoot.dao.UserDao;
import com.example.CrudBoot.model.Role;
import com.example.CrudBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
/*
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
*/
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.getUserByUserName(username);
    }

    @Transactional
    @Override
    public Set<Role> setRoles(String... roles) {
        return userDao.setRoles(roles);
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUserName(username);
    }
}
