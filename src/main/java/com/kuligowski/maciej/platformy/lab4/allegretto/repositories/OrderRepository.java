package com.kuligowski.maciej.platformy.lab4.allegretto.repositories;

import com.kuligowski.maciej.platformy.lab4.allegretto.dao.OrderBok;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderBok, Long> {
}
