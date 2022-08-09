//package com.huseyin.model;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@NoArgsConstructor
//@Entity
//@Table(name = "students" )
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column( name = "first_name", nullable = false)
//    private String firstName;
//    @Column(name = "last_name")
//    private String lastName;
//    @Column(name ="email")
//    private String email;
//
//
//    public Student(String firstName, String lastName, String email) {
//        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }
//
//}
