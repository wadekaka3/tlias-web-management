package com.itheima.service;


import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Brian
 * @version 1.0
 */
public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @param name
     * @param gender
     * @param begin
     * @param end
     * @return
     */
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
    void save(Emp emp);

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * 更新员工信息
     * @param emp
     */
    void update(Emp emp);
}
