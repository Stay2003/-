package cn.net.susan.mapper.sys;

import cn.net.susan.entity.sys.RoleConditionEntity;
import cn.net.susan.entity.sys.RoleEntity;
import java.util.List;

/**
 * 角色 mapper
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:44
 */
public interface RoleMapper {
	/**
     * 查询角色信息
     * 
     * @param id 角色ID
     * @return 角色信息
     */
	RoleEntity findById(Long id);
	
	/**
     * 根据条件查询角色列表
     *
     * @param roleConditionEntity 角色信息
     * @return 角色集合
     */
	List<RoleEntity> searchByCondition(RoleConditionEntity roleConditionEntity);

	/**
	 * 根据条件查询角色数量
	 *
	 * @param roleConditionEntity 角色信息
	 * @return 角色集合
	 */
	int searchCount(RoleConditionEntity roleConditionEntity);
	
	/**
     * 添加角色
     * 
     * @param roleEntity 角色信息
     * @return 结果
     */
	int insert(RoleEntity roleEntity);
	
	/**
     * 修改角色
     * 
     * @param roleEntity 角色信息
     * @return 结果
     */
	int update(RoleEntity roleEntity);
	
	/**
     * 删除角色
     * 
     * @param id 角色ID
     * @return 结果
     */
	int deleteById(Long id);
	
}