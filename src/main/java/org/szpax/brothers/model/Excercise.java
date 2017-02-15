package org.szpax.brothers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marcin on 15.02.2017.
 */
@Entity
public class Excercise {
    @Id
    private Long id;
    @Column
    private String excerciseName;
    @Column
    private String bodyPartCode;

    public Long getId() {return id;}
    public String getExcerciseName() {return excerciseName;}
    public String getBodyPartCode() {return bodyPartCode;}

    public void setExcerciseName() {this.excerciseName = excerciseName;}
    public void setBodyPartCode() {this.bodyPartCode = bodyPartCode;}
}
