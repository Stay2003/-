package cn.net.susan.controller.user;

import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.user.UserConditionEntity;
import cn.net.susan.entity.user.UserEntity;
import cn.net.susan.service.user.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户controller
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午4:29
 */
@Api(tags = "用户操作", description = "用户接口")
@RestController
@RequestMapping("/user")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
    @ApiOperation(notes = "通过id查询用户信息", value = "通过id查询用户信息")
    @GetMapping("/findById")
    public UserEntity findById(Long id) {
        return userDemoService.findById(id);
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
        return userDemoService.searchByPage(userConditionEntity);
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
        return userDemoService.insert(userEntity);
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
        return userDemoService.update(userEntity);
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
        return userDemoService.deleteById(id);
    }
}
