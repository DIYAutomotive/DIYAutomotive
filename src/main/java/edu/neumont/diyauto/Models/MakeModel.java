package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by njurado on 6/2/2014.
 */
@Entity
@Table(name="Make")
public class MakeModel {
    @Id
    @Column(name="idMake")
    @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="account_seq")
    private int MakeID;

    @Column(name="Make", nullable = false)
    private String Make;

    public MakeModel(int MakeID, String Make)
    {
        this.MakeID = MakeID;
        this.Make = Make;
    }
    public int getMakeID() {
        return MakeID;
    }
    public String getMake() {
        return Make;
    }

}
