package com.wbg.springbootdemo.dao;

import com.wbg.springbootdemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends JpaRepository<Role,Integer> {

}
