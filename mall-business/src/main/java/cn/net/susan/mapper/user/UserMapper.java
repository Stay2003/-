package cn.net.susan.mapper.user;

import cn.net.susan.entity.user.UserConditionEntity;
import cn.net.susan.entity.user.UserEntity;

import java.util.List;

/**
 * 用户mapper
 *
 */
public interface UserMapper {

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
    UserEntity findById(Long id);

    /**
     * 根据条件查询用户列表
     *
     * @param userConditionEntity 条件
     * @return 用户列表
     */
    List<UserEntity> searchByCondition(UserConditionEntity userConditionEntity);

    /**
     * 根据条件查询用户数量
     *
     * @param userConditionEntity 条件
     * @return 用户列表
     */
    int searchCount(UserConditionEntity userConditionEntity);

    /**
     * 添加用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
    int insert(UserEntity userEntity);

    /**
     * 修改用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
    int update(UserEntity userEntity);

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
    int deleteById(Long id);
}
