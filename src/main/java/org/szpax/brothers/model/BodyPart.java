package org.szpax.brothers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marcin on 12.02.2017.
 */
@Entity
@Table(name = "body_party")
public class BodyPart {

    @Id
    private String code;

    @Column
    private String bodyPart;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }
}
