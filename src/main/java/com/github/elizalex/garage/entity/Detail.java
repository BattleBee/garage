package com.github.elizalex.garage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // задаем стратегию для генерации значения
    @Column
    private int id;
    @Column(name = "name")
    String name;
    @Column(name = "installOn")
    private int installOn;
    @Column(name = "removeFrom")
    private int removeFrom;
    @Column(name = "usedBy")
    private int usedBy;

    public Detail() {
    }

    public Detail(String name) {
        this.name = name;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstallOn() {
        return installOn;
    }

    public void setInstallOn(int installOn) {
        this.installOn = installOn;
    }

    public int getRemoveFrom() {
        return removeFrom;
    }

    public void setRemoveFrom(int removeFrom) {
        this.removeFrom = removeFrom;
    }

    public int getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(int usedBy) {
        this.usedBy = usedBy;
    }


}
