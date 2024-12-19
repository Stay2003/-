package cn.net.susan.controller.user;

import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.user.UserConditionEntity;
import cn.net.susan.entity.user.UserEntity;
import cn.net.susan.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * 用户controller
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
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
    @PostMapping("/deleteById")
    public int deleteById(@RequestBody @NotNull Long id) {
        return userService.deleteById(id);
    }
}
