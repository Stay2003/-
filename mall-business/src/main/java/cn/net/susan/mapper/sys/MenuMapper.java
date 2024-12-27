package cn.net.susan.mapper.sys;

import cn.net.susan.entity.sys.MenuConditionEntity;
import cn.net.susan.entity.sys.MenuEntity;
import java.util.List;

/**
 * 菜单 mapper
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:44
 */
public interface MenuMapper {
	/**
     * 查询菜单信息
     * 
     * @param id 菜单ID
     * @return 菜单信息
     */
	MenuEntity findById(Long id);
	
	/**
     * 根据条件查询菜单列表
     *
     * @param menuConditionEntity 菜单信息
     * @return 菜单集合
     */
	List<MenuEntity> searchByCondition(MenuConditionEntity menuConditionEntity);

	/**
	 * 根据条件查询菜单数量
	 *
	 * @param menuConditionEntity 菜单信息
	 * @return 菜单集合
	 */
	int searchCount(MenuConditionEntity menuConditionEntity);
	
	/**
     * 添加菜单
     * 
     * @param menuEntity 菜单信息
     * @return 结果
     */
	int insert(MenuEntity menuEntity);
	
	/**
     * 修改菜单
     * 
     * @param menuEntity 菜单信息
     * @return 结果
     */
	int update(MenuEntity menuEntity);
	
	/**
     * 删除菜单
     * 
     * @param id 菜单ID
     * @return 结果
     */
	int deleteById(Long id);
	
}