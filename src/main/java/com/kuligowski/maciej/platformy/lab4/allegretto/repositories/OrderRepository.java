package com.kuligowski.maciej.platformy.lab4.allegretto.repositories;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
