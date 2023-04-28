package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Brian
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    // private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

    /**
     * 查询部门数据
     * @return
     */
//    @RequestMapping(value = "/depts", method = RequestMethod.GET)
//    @GetMapping("/depts")
    @GetMapping
    public Result list() {
        log.info("查询全部部门数据");
        // 调用Service查询部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查找部门：{}", id);
        Dept dept = deptService.get(id);
        return Result.success(dept);
    }


    /**
     * 删除部门
     * @Return
     */
//    @DeleteMapping("/depts/{id}")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除部门：{}", id);
        // 调用service删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @return
     */
//    @PostMapping("/depts")
    @PostMapping
    public Result add(@RequestBody Dept dept) { // @RequestBody 可以将json格式的消息封装到实体类中
        log.info("新增部门:{}", dept);
        // 调用service新增部门
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门:{}", dept);
        // 调用service修改部门
        deptService.update(dept);
        return Result.success();
    }




}
