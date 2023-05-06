package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

/**
 * @author Brian
 * @version 1.0
 */
public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Dept> list();

    /**
     * 删除部门
     * @param id
     */

    void delete(Integer id) throws Exception;

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据id查找部门
     * @param id
     * @return
     */
    Dept get(Integer id);

    /**
     * 根据id修改部门
     * @param dept
     */
    void update(Dept dept);

}
