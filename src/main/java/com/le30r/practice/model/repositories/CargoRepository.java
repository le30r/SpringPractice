package com.le30r.practice.model.repositories;

import com.le30r.practice.model.Cargo;
import com.le30r.practice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CargoRepository extends JpaRepository<Cargo, Long> {


    List<Cargo> findCargoByClient(Client client);
}
