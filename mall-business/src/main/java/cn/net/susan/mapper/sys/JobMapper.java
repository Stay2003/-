package cn.net.susan.mapper.sys;

import cn.net.susan.entity.sys.JobConditionEntity;
import cn.net.susan.entity.sys.JobEntity;
import java.util.List;

/**
 * 岗位 mapper
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:43
 */
public interface JobMapper {
	/**
     * 查询岗位信息
     * 
     * @param id 岗位ID
     * @return 岗位信息
     */
	JobEntity findById(Long id);
	
	/**
     * 根据条件查询岗位列表
     *
     * @param jobConditionEntity 岗位信息
     * @return 岗位集合
     */
	List<JobEntity> searchByCondition(JobConditionEntity jobConditionEntity);

	/**
	 * 根据条件查询岗位数量
	 *
	 * @param jobConditionEntity 岗位信息
	 * @return 岗位集合
	 */
	int searchCount(JobConditionEntity jobConditionEntity);
	
	/**
     * 添加岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	int insert(JobEntity jobEntity);
	
	/**
     * 修改岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	int update(JobEntity jobEntity);
	
	/**
     * 删除岗位
     * 
     * @param id 岗位ID
     * @return 结果
     */
	int deleteById(Long id);
	
}