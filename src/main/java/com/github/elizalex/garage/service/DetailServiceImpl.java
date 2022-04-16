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
    public List<Detail> getAll() {
        return detailDAO.getAll();
    }


    @Override
    @Transactional
    public void save(Detail detail) {
        detailDAO.save(detail);

    }

    @Override
    @Transactional
    public Detail get(int id) {
        return detailDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        detailDAO.delete(id);
    }
}
