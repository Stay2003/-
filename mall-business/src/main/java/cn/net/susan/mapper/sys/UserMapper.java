package cn.net.susan.mapper.sys;

import cn.net.susan.entity.sys.UserConditionEntity;
import cn.net.susan.entity.sys.UserEntity;
import java.util.List;

/**
 * 用户 mapper
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:43
 */
public interface UserMapper {
	/**
     * 查询用户信息
     * 
     * @param id 用户ID
     * @return 用户信息
     */
	UserEntity findById(Long id);
	
	/**
     * 根据条件查询用户列表
     *
     * @param userConditionEntity 用户信息
     * @return 用户集合
     */
	List<UserEntity> searchByCondition(UserConditionEntity userConditionEntity);

	/**
	 * 根据条件查询用户数量
	 *
	 * @param userConditionEntity 用户信息
	 * @return 用户集合
	 */
	int searchCount(UserConditionEntity userConditionEntity);
	
	/**
     * 添加用户
     * 
     * @param userEntity 用户信息
     * @return 结果
     */
	int insert(UserEntity userEntity);
	
	/**
     * 修改用户
     * 
     * @param userEntity 用户信息
     * @return 结果
     */
	int update(UserEntity userEntity);
	
	/**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
	int deleteById(Long id);
	
}