package com.auth.SimpleAuthentication.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "user_data")
public class UserData {
    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;
    @Column(name = "username")
    String userName;
    @Column(name = "password")
    String password;

    public UserData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
