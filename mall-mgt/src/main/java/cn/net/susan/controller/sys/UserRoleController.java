package cn.net.susan.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.sys.UserRoleConditionEntity;
import cn.net.susan.entity.sys.UserRoleEntity;
import cn.net.susan.service.sys.UserRoleService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户角色关联 接口层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:19
 */
@Api(tags = "用户角色关联操作", description = "用户角色关联接口")
@RestController
@RequestMapping("/v1/userRole")
public class UserRoleController {
	
	@Autowired
	private UserRoleService userRoleService;

	/**
	 * 通过id查询用户角色关联信息
	 *
	 * @param id 系统ID
	 * @return 用户角色关联信息
	 */
	@ApiOperation(notes = "通过id查询用户角色关联信息", value = "通过id查询用户角色关联信息")
	@GetMapping("/findById")
	public UserRoleEntity findById(Long id) {
		return userRoleService.findById(id);
	}

	/**
    * 根据条件查询用户角色关联列表
    *
    * @param userRoleConditionEntity 条件
    * @return 用户角色关联列表
    */
	@ApiOperation(notes = "根据条件查询用户角色关联列表", value = "根据条件查询用户角色关联列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<UserRoleEntity> searchByPage(@RequestBody UserRoleConditionEntity userRoleConditionEntity) {
		return userRoleService.searchByPage(userRoleConditionEntity);
	}


	/**
     * 添加用户角色关联
     *
     * @param userRoleEntity 用户角色关联实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加用户角色关联", value = "添加用户角色关联")
	@PostMapping("/insert")
	public int insert(@RequestBody UserRoleEntity userRoleEntity) {
		return userRoleService.insert(userRoleEntity);
	}

	/**
     * 修改用户角色关联
     *
     * @param userRoleEntity 用户角色关联实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改用户角色关联", value = "修改用户角色关联")
	@PostMapping("/update")
	public int update(@RequestBody UserRoleEntity userRoleEntity) {
		return userRoleService.update(userRoleEntity);
	}

	/**
     * 删除用户角色关联
     *
     * @param id 用户角色关联ID
     * @return 影响行数
     */
	@ApiOperation(notes = "删除用户角色关联", value = "删除用户角色关联")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return userRoleService.deleteById(id);
	}
}
