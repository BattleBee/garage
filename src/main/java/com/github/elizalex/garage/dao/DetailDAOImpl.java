package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Detail;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DetailDAOImpl implements DetailDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Detail> getAllDetails() {
        Query query = entityManager.createQuery("from Detail");
        List<Detail> allDetails = query.getResultList();
        return allDetails;
    }

    @Override
    public void saveDetail(Detail detail) {
        Detail newDetail = entityManager.merge(detail);
        detail.setId(newDetail.getId());

    }

    @Override
    public Detail getDetail(int id) {
        Detail detail = entityManager.find(Detail.class, id);
        return detail;
    }

    @Override
    public void deleteDetail(int id) {
        Query query = entityManager.createQuery("delete from Detail"
                + "were id = :detail_id"); // создаем  запрос на удаление по id (проверить)
        query.setParameter("detail_id", id); // этот id в параметрах
        query.executeUpdate(); // выполняем запрос

    }
}
