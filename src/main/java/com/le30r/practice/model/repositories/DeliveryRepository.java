package com.le30r.practice.model.repositories;

import com.le30r.practice.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    List<Delivery> findByReceiver(Integer receiver);
}
