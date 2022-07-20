package com.le30r.practice.controller;


import com.le30r.practice.model.Cargo;
import com.le30r.practice.model.Client;
import com.le30r.practice.model.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private CargoRepository cargoRepository;

    @RequestMapping("/cargo")
    public List<Cargo> getCargos() {
        return cargoRepository.findAll();
    }

    @RequestMapping(value = "/cargos", method = RequestMethod.GET)
    public List<Cargo> getDeliveriesById(@RequestParam Integer clientId) {
        Client client = new Client();
        client.setId(clientId);
        return cargoRepository.findCargoByClient(client);
    }
}
