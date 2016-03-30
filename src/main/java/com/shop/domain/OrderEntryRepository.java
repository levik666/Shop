package com.shop.domain;


import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderEntryRepository extends PagingAndSortingRepository<OrderEntry, Long> {
}
