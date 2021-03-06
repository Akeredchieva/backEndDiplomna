package com.anakeredchieva.doctor.sheduler.entities;



import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctors")
@Builder
@AllArgsConstructor
public class Doctors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "type_of_doctor",nullable = false)
    private String typeOfDoctor;

    @Column(name = "telephone")
    private String telephone;

    @ManyToMany
    @JoinTable(name = "doctors_patients",
            joinColumns = @JoinColumn(name = "doctor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "id"))
    private List<Patients> patients;

    public Doctors() {
        this.setPatients(new ArrayList<>());
    }

    public Doctors(String firstName, String lastName, String email, String username, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public Doctors(String firstName, String lastName, String email, String username, String password, String telephone) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setTelephone(telephone);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Patients> getPatients() {
        return patients;
    }

    public void setPatients(List<Patients> patients) {
        this.patients = patients;
    }

    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }

    public void setTypeOfDoctor(String typeOfDoctor) {
        this.typeOfDoctor = typeOfDoctor;
    }
}