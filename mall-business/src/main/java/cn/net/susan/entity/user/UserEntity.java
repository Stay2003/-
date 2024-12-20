package cn.net.susan.entity.user;

import cn.net.susan.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    /**
     * 用户名称
     */
    private String userName;
}
