package cn.net.susan.service.sys;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.net.susan.mapper.sys.RoleMapper;
import cn.net.susan.entity.sys.RoleConditionEntity;
import cn.net.susan.entity.sys.RoleEntity;
import cn.net.susan.entity.ResponsePageEntity;

/**
 * 角色 服务层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:44
 */
@Service
public class RoleService {

	@Autowired
	private RoleMapper roleMapper;

	/**
     * 查询角色信息
     * 
     * @param id 角色ID
     * @return 角色信息
     */
	public RoleEntity findById(Long id) {
	    return roleMapper.findById(id);
	}
	
	/**
     * 根据条件分页查询角色列表
     * 
     * @param roleConditionEntity 角色信息
     * @return 角色集合
     */
	public ResponsePageEntity<RoleEntity> searchByPage(RoleConditionEntity roleConditionEntity) {
		int count = roleMapper.searchCount(roleConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(roleConditionEntity);
		}
		List<RoleEntity> dataList = roleMapper.searchByCondition(roleConditionEntity);
		return ResponsePageEntity.build(roleConditionEntity, count, dataList);
	}
	
    /**
     * 新增角色
     * 
     * @param roleEntity 角色信息
     * @return 结果
     */
	public int insert(RoleEntity roleEntity) {
	    return roleMapper.insert(roleEntity);
	}
	
	/**
     * 修改角色
     * 
     * @param roleEntity 角色信息
     * @return 结果
     */
	public int update(RoleEntity roleEntity) {
	    return roleMapper.update(roleEntity);
	}

	/**
     * 删除角色对象
     * 
     * @param id 系统ID
     * @return 结果
     */
	public int deleteById(Long id) {
		return roleMapper.deleteById(id);
	}
	
}
