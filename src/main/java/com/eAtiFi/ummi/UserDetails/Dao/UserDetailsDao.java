package com.eAtiFi.ummi.UserDetails.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eAtiFi.ummi.UserDetails.Beans.UserDetailsMetadata;



public interface UserDetailsDao extends JpaRepository<UserDetailsMetadata,Long>{

}
