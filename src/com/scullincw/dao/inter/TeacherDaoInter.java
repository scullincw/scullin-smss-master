package com.scullincw.dao.inter;

import java.util.List;

import com.scullincw.dao.inter.BaseDaoInter;
import com.scullincw.bean.Clazz;
import com.scullincw.bean.Grade;
import com.scullincw.bean.Teacher;

/**
 * 操作教师的数据层接口
 * @author scullincw
 *
 */
public interface TeacherDaoInter extends BaseDaoInter {
	
	/**
	 * 获取教师信息，这里需要将教师所选择的课程查询出来
	 * @param sql
	 * @param param
	 * @param grade 年级参数
	 * @param clazz 班级参数
	 * @return
	 */
	public List<Teacher> getTeacherList(String sql, Object[] param, Grade grade, Clazz clazz);
	
}
