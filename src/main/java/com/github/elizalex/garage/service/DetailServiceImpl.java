package com.github.elizalex.garage.service;

import com.github.elizalex.garage.dao.DetailDAO;
import com.github.elizalex.garage.entity.Detail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
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
