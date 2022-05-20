package com.auth.SimpleAuthentication.service;

import com.auth.SimpleAuthentication.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {
    UserData findByUserName(String userName);

    @Transactional
    @Modifying
    @Query("Update user_data set password= :newPassword where id= :id")
    void updatePassword(@Param("id") int id, @Param("newPassword") String newPassword);
}
