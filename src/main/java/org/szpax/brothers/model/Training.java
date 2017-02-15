package org.szpax.brothers.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Marcin on 14.02.2017.
 */
@Entity
public class Training {
    @Id
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

