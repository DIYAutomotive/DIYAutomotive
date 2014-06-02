package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by njurado on 6/2/2014.
 */
@Entity
@Table(name="SubModel")
public class SubModel {
        @Id
        @Column(name="idSubModel", nullable = false)
        @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
        @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="account_seq")
        private int SubID;

        @Column(name="SubModel", nullable = false)
        private String subModel;

        public SubModel(int SubID, String subMake)
        {
            this.SubID = SubID;
            this.subModel = subMake;
        }
        public int getSubID() {
            return SubID;
        }
        public String getSubMake() {
            return subModel;
        }
}
