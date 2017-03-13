package org.szpax.brothers.model;

import javax.persistence.*;

/**
 * Created by Marcin on 15.02.2017.
 */
@Entity
public class Excercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column
    private String excerciseName;
    @Column
    private String bodyPartCode;

    public Long getId() {
        return id;
    }

    public String getExcerciseName() {
        return excerciseName;
    }

    public String getBodyPartCode() {
        return bodyPartCode;
    }

    public void setExcerciseName(String excerciseName) {
        this.excerciseName = excerciseName;
    }

    public void setBodyPartCode(String bodyPartCode) {
        this.bodyPartCode = bodyPartCode;
    }
}
