package com.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
/**
 * 课程Dao层接口
 * @author vip
 *
 */
@Mapper
public interface CourseDao {
	/**
	 * 首页查询课程信息
	 * @param map
	 * @return
	 */
	public ArrayList<HashMap<String,Object>> queryCourseList(HashMap<String,Object> map);
	/**
	 * 首页查询课程总条数
	 * @param hashMap
	 * @return
	 */
	public int queryCourseListCount(HashMap<String,Object> hashMap);
}
