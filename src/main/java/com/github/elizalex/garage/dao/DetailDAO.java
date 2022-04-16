package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Detail;

import java.util.List;

public interface DetailDAO {
    List<Detail> getAll();

    void save(Detail detail);

    Detail get(int id);

    void delete(int id);
}
