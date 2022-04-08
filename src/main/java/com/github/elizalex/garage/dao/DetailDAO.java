package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Detail;

import java.util.List;

public interface DetailDAO {
    List<Detail> getDetail();

    void saveDetail(Detail detail);

    Detail getDetail(int id);

    void deleteDetail(int id);
}
