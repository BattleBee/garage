package com.github.elizalex.garage.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "detail")
public class Detail {
    private int id;
    String name;
    private Car installOn;
    private Car removeFrom;
    private Employee usedBy;


    @Override
    public String toString() {
        return "Detail{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", installOn=" + installOn
                + ", removeFrom=" + removeFrom
                + ", usedBy=" + usedBy
                + '}';
    }
}
