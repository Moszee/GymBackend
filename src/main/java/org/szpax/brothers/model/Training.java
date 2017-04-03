package org.szpax.brothers.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Marcin on 14.02.2017.
 */
@Entity
public class Training {

    @Id
    @SequenceGenerator(name = " training_id_seq", sequenceName = " training_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " training_id_seq")
    @Column(updatable = false)

    private Long id;
    @Column
    private Integer clientId;
    @Column
    private Date birthDate;
    @Column
    private String timeOfTheDayCode;

    public Long getId(){return id;}
    public int getClientId() {return clientId;}
    public void setClientId() {this.clientId = clientId;}
    public Date getBirthDate() {return  birthDate;}
    public void setBirthDate () {this.birthDate = birthDate;}
    public String getTimeOfTheDayCode() {return timeOfTheDayCode;}
    public void setTimeOfTheDayCode() {this.timeOfTheDayCode = timeOfTheDayCode;}

}

