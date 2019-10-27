package com.example.demo.service.impl;

import com.example.demo.dao.CourseJpaRepository;
import com.example.demo.dto.CourseDto;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseJpaRepository courseJpaRepository;

    @Override
    public List<CourseDto> getAllCourse() {
        List<Course> courses = this.courseJpaRepository.findAll();

        List<CourseDto> dtos = new ArrayList<CourseDto>();
        for(Course course : courses)
        {
            CourseDto dto = new CourseDto(course);
            dtos.add(dto);
        }
        return dtos;
    }

}
