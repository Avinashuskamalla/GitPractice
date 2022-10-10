package com.example.blog.stackify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blog.stackify.Employee;

@Repository
public interface EmpRespository    extends JpaRepository<Employee, Integer>{

}
