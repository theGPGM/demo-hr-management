package org.george.pm.mapper;

import org.apache.ibatis.annotations.Param;
import org.george.pm.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeesByPage(@Param("offset") Integer offset, @Param("size") Integer size, String keywords);

    Long getTotal(String keywords);

    Integer addEmps(List<Employee> list);

    Employee getEmployeeById(Integer id);
}