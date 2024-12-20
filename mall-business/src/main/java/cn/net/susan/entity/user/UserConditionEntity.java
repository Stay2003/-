package cn.net.susan.entity.user;

import cn.net.susan.entity.RequestPageEntity;
import lombok.Data;

/**
 * 用户查询条件实体
 *
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
