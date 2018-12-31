package com.wbg.springbootdemo.service;

import com.wbg.springbootdemo.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService  {
   List<Role> listAll();
   void save(Role role);
   void update(Role role);
   void delete(int id);
   Optional<Role> findById(int id);
}
