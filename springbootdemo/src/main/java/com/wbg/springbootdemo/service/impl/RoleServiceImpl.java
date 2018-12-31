package com.wbg.springbootdemo.service.impl;

import com.wbg.springbootdemo.dao.RoleMapper;
import com.wbg.springbootdemo.entity.Role;
import com.wbg.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     *
     * 查询全部
     * @return
     */
    @Override
    public List<Role> listAll() {
        return roleMapper.findAll();
    }

    /**
     * 添加
     * @param role
     */
    @Override
    public void save(Role role) {
        roleMapper.save(role);
        System.out.println("添加");
    }
    //如果有就修改、没有就添加
    @Override
    public void update(Role role) {
        roleMapper.saveAndFlush(role);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(int id) {
        roleMapper.delete(new Role(id));
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @Override
    public Optional<Role> findById(int id) {
        return  roleMapper.findById(id);
    }
}
