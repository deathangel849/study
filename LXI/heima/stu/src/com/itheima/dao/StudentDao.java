package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import com.itheima.domain.*;

public interface StudentDao {
	int PAGE_SIZE = 5;// 一页显示多少条纪律

	/**
	 * 查询目标页数的学生
	 * 
	 * @param currentPage
	 * @return
	 * @throws SQLException
	 */
	List<Student> findStudentByPage(int currentPage) throws SQLException;

	/**
	 * 查询所有学生
	 * 
	 * @param rowCount
	 * @return List<Student>
	 */
	List<Student> findAll(int rowCount) throws SQLException;

	/**
	 * 添加学生
	 * 
	 * @param student 需要添加到数据库的学生
	 * @throws SQLException
	 */
	void insert(Student student) throws SQLException;

	/**
	 * 删除学生
	 * 
	 * @param sid 需要删除的学生的id
	 * @throws SQLException
	 */
	void delete(String sid) throws SQLException;

	/**
	 * 查询学生
	 * 
	 * @param sid 需要查询的学生的id
	 * @return
	 * @throws SQLException
	 */
	List<Student> find(String sid) throws SQLException;

	/**
	 * 更新学生信息
	 * 
	 * @param student 待更新的学生的信息
	 * @return
	 * @throws SQLException
	 */
	void update(Student student) throws SQLException;

	/**
	 * 查询符合条件的学生
	 * 
	 * @param sname gender
	 * @return
	 * @throws SQLException
	 */
	List<Student> findAll(String sname, String gender) throws SQLException;

	/**
	 * 查询总的学生记录数
	 * @return
	 * @throws SQLException
	 */
	int findCount()throws SQLException;
}
