package com.le30r.practice.controller;

import com.le30r.practice.config.MainConfig;
import com.le30r.practice.model.Delivery;
import com.le30r.practice.model.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @RequestMapping("/deliveries")
    public List<Delivery> getDeliveries() {
        return deliveryRepository.findAll();
    }

    @RequestMapping(value = "/delivery", method = RequestMethod.GET)
    public List<Delivery> getDeliveriesById(@RequestParam Integer receiver) {
        return deliveryRepository.findByReceiver(receiver);
    }
}
