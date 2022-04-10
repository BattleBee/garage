package com.github.elizalex.garage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {
    /**
     * можем использовать один контроллер с множеством аннотаций @RequestMapping
     * аннотации не должны повторяться иначе спринг выдаст ошибку
     */

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    /**
     * метод для запроса информации с view
     */
    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-vew";
    }


    /**
     * метод для  иозвате информации на view
     */
    @RequestMapping("/showDetails")
    public String showEmployeeDetails() {
        return "show-emp-details-vew";
    }

}
