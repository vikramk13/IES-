package com.fintech.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintech.ies.co.entity.BatchRunDetails;

public interface BatchRunDetailsRepo extends JpaRepository<BatchRunDetails, Serializable> {

}
