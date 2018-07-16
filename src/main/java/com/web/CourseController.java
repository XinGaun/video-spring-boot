package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.CourseService;

@RequestMapping("/videoMove/Course")
@ResponseBody
@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	@RequestMapping(value="/queryCourseList",produces="application/json;charset=utf-8",method=RequestMethod.POST)
	public String queryCourseList(@RequestBody String data) {
		return courseService.queryCourseList(data);
	}
}
