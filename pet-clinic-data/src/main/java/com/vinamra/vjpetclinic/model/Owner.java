package com.vinamra.vjpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id,String firstName, String lastName, String address,
                 String city, String telephone, Set<Pet> pets) {
        super(id,firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;

    //here cascade means that if I delete the owner then the pets also gets deleted corresponding to that owner
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    //bcz of project lombok now we do not need this
//    public Set<Pet> getPets() {
//        return pets;
//    }
//
//    public void setPets(Set<Pet> pets) {
//        this.pets = pets;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
}
