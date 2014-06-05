package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/5/14.
 */
@Entity
@Table(name = "Model", schema = "", catalog = "diyauto")
public class ModelModel {
    private int idModel;
    private String model;
    private Collection<CarsModel> carsesByIdModel;

    @Id
    @Column(name = "idModel")
    public int getIdModel() {
        return idModel;
    }

    public void setIdModel(int idModel) {
        this.idModel = idModel;
    }

    @Basic
    @Column(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelModel that = (ModelModel) o;

        if (idModel != that.idModel) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idModel;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "modelByModelId")
    public Collection<CarsModel> getCarsesByIdModel() {
        return carsesByIdModel;
    }

    public void setCarsesByIdModel(Collection<CarsModel> carsesByIdModel) {
        this.carsesByIdModel = carsesByIdModel;
    }
}
