package com.stacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.stacy.entity.House;


@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {

    @Query(value="SELECT * FROM house H WHERE is_on_market = 1", nativeQuery=true)
    public List<House> getAllOnMarketListings;
}