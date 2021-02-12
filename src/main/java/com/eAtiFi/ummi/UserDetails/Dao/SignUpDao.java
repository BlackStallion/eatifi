package com.eAtiFi.ummi.UserDetails.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eAtiFi.ummi.UserDetails.Beans.SignUpMetadata;


public interface SignUpDao extends JpaRepository<SignUpMetadata,Long>{

}
