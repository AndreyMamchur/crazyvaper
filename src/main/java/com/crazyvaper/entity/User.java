package com.crazyvaper.entity;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private int age;

    @ColumnDefault(value = " ")
    private String phoneNumber;

    private Role role;

    private String password;

    private boolean login;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    @ColumnDefault(value = "1")
    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    @Enumerated(EnumType.STRING)
    @ColumnDefault(value = "Role.USER")
    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    @Column(nullable = false)
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLogin() {
        return login;
    }

    @Type(type="true_false")
    @ColumnDefault(value = "false")
    public void setLogin(Boolean login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                ", password='" + password + '\'' +
                ", login=" + login +
                '}';
    }
}
