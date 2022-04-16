package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> getAll();

    void save(Detail detail);

    Detail get(int id);

    void delete(int id);
}
