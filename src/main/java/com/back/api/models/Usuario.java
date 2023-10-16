/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author daniel
 */
@Entity
@Table(name="usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;
    
     @Getter @Setter @Column(name = "nombre")
    private String nombre;
     
      @Getter @Setter @Column(name = "apellido")
    private String apellido;
      
   @Getter @Setter @Column(name = "email")
    private String email;
   
    @Getter @Setter @Column(name = "telefono")
   private String telefeno;
    
    @Getter @Setter @Column(name = "password")
    private String password;

}