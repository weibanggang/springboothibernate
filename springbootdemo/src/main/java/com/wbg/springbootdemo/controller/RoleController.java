package com.wbg.springbootdemo.controller;

import com.wbg.springbootdemo.entity.Role;
import com.wbg.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
    //private RoleService roleService;

    @GetMapping("/all")
    public List<Role> listAll(){
       return roleService.listAll();
    }

    @GetMapping("/delete")
    public List<Role> delete(int id){
        roleService.delete(id);
        return roleService.listAll();
    }

    @GetMapping("/getById")
    public Optional<Role> getById(int id){
        return roleService.findById(id);
    }

    @PostMapping("/insert")
    public List<Role> insert( Role role){
        roleService.save(role);
        return roleService.listAll();
    }
    @PostMapping("/update")
    public List<Role> update(Role role){
        roleService.update(role);
        return roleService.listAll();
    }

}
