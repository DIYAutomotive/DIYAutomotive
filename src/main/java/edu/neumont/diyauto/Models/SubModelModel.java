package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "SubModel", schema = "diyauto")
public class SubModelModel {
    private int idSubModel;
    private String subModel;
    private Collection<CarsModel> carsesByIdSubModel;

    @Id
    @Column(name = "idSubModel")
    public int getIdSubModel() {
        return idSubModel;
    }

    public void setIdSubModel(int idSubModel) {
        this.idSubModel = idSubModel;
    }

    @Basic
    @Column(name = "SubModel")
    public String getSubModel() {
        return subModel;
    }

    public void setSubModel(String subModel) {
        this.subModel = subModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubModelModel that = (SubModelModel) o;

        if (idSubModel != that.idSubModel) return false;
        if (subModel != null ? !subModel.equals(that.subModel) : that.subModel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSubModel;
        result = 31 * result + (subModel != null ? subModel.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "subModelBySubModelId")
    public Collection<CarsModel> getCarsesByIdSubModel() {
        return carsesByIdSubModel;
    }

    public void setCarsesByIdSubModel(Collection<CarsModel> carsesByIdSubModel) {
        this.carsesByIdSubModel = carsesByIdSubModel;
    }
}
