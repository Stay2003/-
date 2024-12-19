package cn.net.susan.entity.user;

import cn.net.susan.entity.RequestPageEntity;
import lombok.Data;

/**
 * 用户查询条件实体
 *
 * @author 苏三，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午4:00
 */
@Data
public class UserConditionEntity extends RequestPageEntity {
    /**
     * 系统ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

}
