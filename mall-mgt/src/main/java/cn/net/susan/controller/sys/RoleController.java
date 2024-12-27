package cn.net.susan.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.sys.RoleConditionEntity;
import cn.net.susan.entity.sys.RoleEntity;
import cn.net.susan.service.sys.RoleService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 角色 接口层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@Api(tags = "角色操作", description = "角色接口")
@RestController
@RequestMapping("/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	/**
	 * 通过id查询角色信息
	 *
	 * @param id 系统ID
	 * @return 角色信息
	 */
	@ApiOperation(notes = "通过id查询角色信息", value = "通过id查询角色信息")
	@GetMapping("/findById")
	public RoleEntity findById(Long id) {
		return roleService.findById(id);
	}

	/**
    * 根据条件查询角色列表
    *
    * @param roleConditionEntity 条件
    * @return 角色列表
    */
	@ApiOperation(notes = "根据条件查询角色列表", value = "根据条件查询角色列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<RoleEntity> searchByPage(@RequestBody RoleConditionEntity roleConditionEntity) {
		return roleService.searchByPage(roleConditionEntity);
	}


	/**
     * 添加角色
     *
     * @param roleEntity 角色实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加角色", value = "添加角色")
	@PostMapping("/insert")
	public int insert(@RequestBody RoleEntity roleEntity) {
		return roleService.insert(roleEntity);
	}

	/**
     * 修改角色
     *
     * @param roleEntity 角色实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改角色", value = "修改角色")
	@PostMapping("/update")
	public int update(@RequestBody RoleEntity roleEntity) {
		return roleService.update(roleEntity);
	}

	/**
     * 删除角色
     *
     * @param id 角色ID
     * @return 影响行数
     */
	@ApiOperation(notes = "删除角色", value = "删除角色")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return roleService.deleteById(id);
	}
}
