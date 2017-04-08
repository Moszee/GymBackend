package org.szpax.brothers.model;

import javax.persistence.*;

/**
 * Created by Marcin on 08.04.2017.
 */
@Entity
public class TrainingExcercise {
    @Id
    @SequenceGenerator(name = "traning_excercise_id_seq", sequenceName = "traning_excercise_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "traning_excercise_id_seq")
    @Column(updatable = false)
    private Integer id;

    @Column
    private Integer trainingId;

    @Column
    private Integer excerciseId;

    @Column
    private Integer numberOfRepeats;

    @Column
    public Integer getId() {
        return id;
    }

    ;

    public Integer getNumberOfRepeats() {
        return numberOfRepeats;
    }

    public Integer getTrainingId() {
        return trainingId;
    }

    public Integer getExcerciseId() {
        return excerciseId;
    }

    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    public void setExcerciseId(Integer excerciseId) {
        this.excerciseId = excerciseId;
    }

    public void setNumberOfRepeats(Integer numberOfRepeats) {
        this.numberOfRepeats = numberOfRepeats;
    }
}

