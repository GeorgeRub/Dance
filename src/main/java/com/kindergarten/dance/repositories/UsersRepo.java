package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<User, Long> {


    User findUsersByLogin(String login);

    @Query("select u from User u join fetch u.role where u.id = ?1")
    User findUsersById(Long userId);

    @Modifying
    @Transactional(readOnly = false)
    @Query(value = "update users u set u.r_id = ?2 where u.u_id = ?1", nativeQuery = true)
    void setRole(Long usersId, Long roleId);

    @Query(value = "select u from User u inner join Roles r on r.id = u.role where u.enabled = true and r.role = 'ROLE_FAMILY'")
    List<User> getAllClients();

    Optional<User> findByLogin(String email);

    @Query("select u from User u inner join Roles r on r.id = u.role where r.role = 'ROLE_FAMILY'")
    List<User> findAllFamilyUsers();

    @Query(value = "SELECT* FROM child" +
            " LEFT JOIN users ON (child.u_id = users.u_id)" +
            " LEFT JOIN children_group ON (child.cg_id = children_group.cg_id)" +
            " WHERE (children_group.cg_id = ?1)", nativeQuery = true)
    List<User> getAllActiveUsersByChildrenGroupId(Long groupId);
}
