package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by njurado on 6/2/2014.
 */
@Entity
@Table(name="Model")
public class Model{

    @Id
    @Column(name="idModel", nullable = false)
    @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="account_seq")
    private int ModelID;

    @Column(name="Model", nullable = false)
    private String Model;

    public Model(int ModelID, String Model)
    {
        this.ModelID = ModelID;
        this.Model = Model;
    }
    public String getModel() {
        return Model;
    }
    public int getModelID() {
        return ModelID;
    }
}
