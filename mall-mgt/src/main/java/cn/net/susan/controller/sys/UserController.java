package cn.net.susan.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.sys.UserConditionEntity;
import cn.net.susan.entity.sys.UserEntity;
import cn.net.susan.service.sys.UserService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户 接口层
 *
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@Api(tags = "用户操作", description = "用户接口")
@RestController
@RequestMapping("/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 通过id查询用户信息
	 *
	 * @param id 系统ID
	 * @return 用户信息
	 */
	@ApiOperation(notes = "通过id查询用户信息", value = "通过id查询用户信息")
	@GetMapping("/findById")
	public UserEntity findById(Long id) {
		return userService.findById(id);
	}

	/**
    * 根据条件查询用户列表
    *
    * @param userConditionEntity 条件
    * @return 用户列表
    */
	@ApiOperation(notes = "根据条件查询用户列表", value = "根据条件查询用户列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<UserEntity> searchByPage(@RequestBody UserConditionEntity userConditionEntity) {
		return userService.searchByPage(userConditionEntity);
	}


	/**
     * 添加用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加用户", value = "添加用户")
	@PostMapping("/insert")
	public int insert(@RequestBody UserEntity userEntity) {
		return userService.insert(userEntity);
	}

	/**
     * 修改用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改用户", value = "修改用户")
	@PostMapping("/update")
	public int update(@RequestBody UserEntity userEntity) {
		return userService.update(userEntity);
	}

	/**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
	@ApiOperation(notes = "删除用户", value = "删除用户")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return userService.deleteById(id);
	}
}
