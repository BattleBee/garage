package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.repository.DetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DetailService {

    private final DetailRepository detailRepository;

    public Detail findById(Long id) {
        return detailRepository.findById(id).orElse(null);
    }

    public List<Detail> findAllDetail() {
        return detailRepository.findAll();
    }

    public Detail saveDetail(Detail detail) {
        log.info("Saving new {}", detail);
        return detailRepository.save(detail);
    }

    public void deleteById(Long id) {
        detailRepository.deleteById(id);
    }
}
