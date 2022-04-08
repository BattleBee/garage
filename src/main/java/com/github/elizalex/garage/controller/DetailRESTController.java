package com.github.elizalex.garage.controller;

import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetailRESTController {

    @Autowired
    private DetailService detailService;

    @GetMapping("/detail")
    public List<Detail> showAllDetails() {
        List<Detail> allDetails = detailService.getAllDetails();
        return allDetails;
    }

    @GetMapping("/details/{id}")
    public Detail getDetail(@PathVariable int id) {
        Detail detail = detailService.getDetail(id);
        return detail;
    }

    @PostMapping("/details")
    public Detail addNewDetail(@RequestBody Detail detail) {
        detailService.saveDetail(detail);
        return detail;
    }

    @PutMapping("/details")
    public Detail updateDetail(@RequestBody Detail detail) {
        detailService.saveDetail(detail);
        return detail;
    }

    @DeleteMapping("/details/{id}")
    public String deleteDetail(@PathVariable int id) {
        detailService.deleteDetail(id);
        return "Detail with id = " + id + " was deleted";
    }

}
