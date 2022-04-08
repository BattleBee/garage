package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> getAllDetails();

    void saveDetail(Detail detail);

    Detail getDetail(int id);

    void deleteDetail(int id);
}
