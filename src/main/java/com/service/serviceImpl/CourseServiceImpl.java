package com.service.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.dao.CourseDao;
import com.service.CourseService;
import com.util.Count;
@SuppressWarnings("unchecked")
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	private Logger logger = Logger.getLogger(CourseServiceImpl.class);
	/**
	 * 首页查询课程信息
	 */
	@Override
	public String queryCourseList(String data) {
		logger.info("queryCourseList data: "+data);
		HashMap<String,Object> dataMap = JSON.parseObject(data, HashMap.class);
		ArrayList<HashMap<String,Object>> resultList = courseDao.queryCourseList(dataMap);
		int count = courseDao.queryCourseListCount(dataMap);	
		for(int i=0;i<6;i++) {
			HashMap<String,Object> ss = new HashMap<String,Object>();
			ss.put("courses_id", 5);
			ss.put("courses_img_url", "http://www.niceyuwen.com/image/aa871ecf95db4bf7a40740f2516912bb.png");
			ss.put("courses_name", "guan1111");
			ss.put("courses_pricemoney", "0.01");
			resultList.add(ss);
		}
		return JSON.toJSONString(Count.counts(resultList, count, dataMap,200,"queryCourseList success"));
	}

}
