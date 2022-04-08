package com.github.elizalex.garage.service;

import com.github.elizalex.garage.dao.DetailDAO;
import com.github.elizalex.garage.entity.Detail;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDAO detailDAO;

    @Override
    @Transactional
    public List<Detail> getAllDetails() {
        return detailDAO.getAllDetails();
    }


    @Override
    @Transactional
    public void saveDetail(Detail detail) {
        detailDAO.saveDetail(detail);

    }

    @Override
    @Transactional
    public Detail getDetail(int id) {
        return detailDAO.getDetail(id);
    }

    @Override
    @Transactional
    public void deleteDetail(int id) {
        detailDAO.deleteDetail(id);
    }
}
