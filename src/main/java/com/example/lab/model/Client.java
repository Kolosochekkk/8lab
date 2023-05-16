package com.example.lab.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="client")
public class Client {

    @Id
    @Column(name = "id", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "surname", length = 255)
    private String surname;
    @Column(name = "patronymic", length = 255)
    private String patronymic;
    @Column(name = "gender", length = 255)
    private boolean gender;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "series_passport", length = 255)
    private String series_passport;
    @Column(name = "number_passport", length = 255)
    private String number_passport;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "telephone", length = 255)
    private String telephone;
    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "employed", length = 255)
    private Boolean employed;

    @Column(name = "position", length = 255)
    private String position;
    @Column(name = "registration", length = 255)
    private String registration;
    @Column(name = "citizenship", length = 255)
    private String citizenship;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSeries_passport() {
        return series_passport;
    }

    public void setSeries_passport(String series_passport) {
        this.series_passport = series_passport;
    }

    public String getNumber_passport() {
        return number_passport;
    }

    public void setNumber_passport(String number_passport) {
        this.number_passport = number_passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmployed() {
        return employed;
    }

    public void setEmployed(Boolean employed) {
        this.employed = employed;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
