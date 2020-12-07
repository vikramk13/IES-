package com.fintech.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fintech.ies.co.entity.CoPdfs;

@Repository
public interface CoPdfsRepo  extends JpaRepository<CoPdfs, Serializable>{

}
