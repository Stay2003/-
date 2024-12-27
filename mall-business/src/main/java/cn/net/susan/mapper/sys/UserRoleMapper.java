package cn.net.susan.mapper.sys;

import cn.net.susan.entity.sys.UserRoleConditionEntity;
import cn.net.susan.entity.sys.UserRoleEntity;
import java.util.List;

/**
 * 用户角色关联 mapper
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:45
 */
public interface UserRoleMapper {
	/**
     * 查询用户角色关联信息
     * 
     * @param id 用户角色关联ID
     * @return 用户角色关联信息
     */
	UserRoleEntity findById(Long id);
	
	/**
     * 根据条件查询用户角色关联列表
     *
     * @param userRoleConditionEntity 用户角色关联信息
     * @return 用户角色关联集合
     */
	List<UserRoleEntity> searchByCondition(UserRoleConditionEntity userRoleConditionEntity);

	/**
	 * 根据条件查询用户角色关联数量
	 *
	 * @param userRoleConditionEntity 用户角色关联信息
	 * @return 用户角色关联集合
	 */
	int searchCount(UserRoleConditionEntity userRoleConditionEntity);
	
	/**
     * 添加用户角色关联
     * 
     * @param userRoleEntity 用户角色关联信息
     * @return 结果
     */
	int insert(UserRoleEntity userRoleEntity);
	
	/**
     * 修改用户角色关联
     * 
     * @param userRoleEntity 用户角色关联信息
     * @return 结果
     */
	int update(UserRoleEntity userRoleEntity);
	
	/**
     * 删除用户角色关联
     * 
     * @param id 用户角色关联ID
     * @return 结果
     */
	int deleteById(Long id);
	
}