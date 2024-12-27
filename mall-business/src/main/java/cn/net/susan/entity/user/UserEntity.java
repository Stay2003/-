package cn.net.susan.entity.user;

import cn.net.susan.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午3:37
 */
@Data
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    /**
     * 用户名称
     */
    private String userName;
}
