package cn.net.susan.entity.sys;

import cn.net.susan.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 思源
 * @date 2024-01-08 17:18:18
 */
@ApiModel("用户实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity extends BaseEntity {
	

	/**
	 * 头像
	 */
	@ApiModelProperty("头像")
	private Long avatarId;

	/**
	 * 邮箱
	 */
	@ApiModelProperty("邮箱")
	private String email;

	/**
	 * 密码
	 */
	@ApiModelProperty("密码")
	private String password;

	/**
	 * 用户名
	 */
	@ApiModelProperty("用户名")
	private String userName;

	/**
	 * 部门ID
	 */
	@ApiModelProperty("部门ID")
	private Long deptId;

	/**
	 * 手机号码
	 */
	@ApiModelProperty("手机号码")
	private String phone;

	/**
	 * 岗位ID
	 */
	@ApiModelProperty("岗位ID")
	private Long jobId;

	/**
	 * 最后修改密码的日期
	 */
	@ApiModelProperty("最后修改密码的日期")
	private Date lastChangePasswordTime;

	/**
	 * 别名
	 */
	@ApiModelProperty("别名")
	private String nickName;

	/**
	 * 性别 1：男 2：女
	 */
	@ApiModelProperty("性别 1：男 2：女")
	private Integer sex;

	/**
	 * 有效状态 1:有效 0:无效
	 */
	@ApiModelProperty("有效状态 1:有效 0:无效")
	private Integer validStatus;
}
