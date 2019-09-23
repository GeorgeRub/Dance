package com.kindergarten.dance.services;

import com.kindergarten.dance.model.auth.User;
import com.kindergarten.dance.repositories.UsersRepo;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.List;

@Service
public class UsersService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;


    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        User user = usersRepo.findByLogin(userName)
                .orElseThrow(() -> new UsernameNotFoundException("Email " + userName + " not found"));
        return new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                user.getPassword(),
                getAuthorities(user)
        );
    }


    private static Collection<? extends GrantedAuthority> getAuthorities(User user) {
        String userRoles = user.getRole().getRole();
        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
        return authorities;
    }

    public List<User> getAllUsers() {
        return usersRepo.findAll();
    }

    public User getUserByLogin(String user) {
        try {
            User u = usersRepo.findUsersByLogin(user);
            return u;
        }catch (Exception e){
            return null;
        }
    }


    @Modifying
    @Transactional(readOnly = false)
    public User saveUser(User u) {
        return usersRepo.save(u);
    }

    public User getUserById(Long userId) {
        User users = usersRepo.findUsersById(userId);
        Hibernate.initialize(users.getRole());
        return users;
    }

    @Modifying
    public void updateUser(User users) {
        usersRepo.saveAndFlush(users);


    }

    @Transactional(readOnly = false)
    @Modifying
    public void setRole(Long userId, Long roleId) {
        usersRepo.setRole(userId, roleId);
    }

    public List<User> getAllClients() {
        return usersRepo.getAllClients();
    }

    public List<User> getAllActiveFamilyUsers() {
        return usersRepo.getAllClients();
    }

    public List<User> getAllActiveUsersByChildrenGroupId(Long groupId) {
        return usersRepo.getAllActiveUsersByChildrenGroupId(groupId);
    }
}
