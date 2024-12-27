package cn.net.susan.entity.sys;

import cn.net.susan.entity.RequestPageEntity;
import lombok.Data;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户查询条件实体
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@ApiModel("用户查询条件实体")
@Data
public class UserConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  头像
     */
	@ApiModelProperty("头像")
	private Long avatarId;

	/**
	 *  邮箱
     */
	@ApiModelProperty("邮箱")
	private String email;

	/**
	 *  密码
     */
	@ApiModelProperty("密码")
	private String password;

	/**
	 *  用户名
     */
	@ApiModelProperty("用户名")
	private String userName;

	/**
	 *  部门ID
     */
	@ApiModelProperty("部门ID")
	private Long deptId;

	/**
	 *  手机号码
     */
	@ApiModelProperty("手机号码")
	private String phone;

	/**
	 *  岗位ID
     */
	@ApiModelProperty("岗位ID")
	private Long jobId;

	/**
	 *  最后修改密码的日期
     */
	@ApiModelProperty("最后修改密码的日期")
	private Date lastChangePasswordTime;

	/**
	 *  别名
     */
	@ApiModelProperty("别名")
	private String nickName;

	/**
	 *  性别 1：男 2：女
     */
	@ApiModelProperty("性别 1：男 2：女")
	private Integer sex;

	/**
	 *  有效状态 1:有效 0:无效
     */
	@ApiModelProperty("有效状态 1:有效 0:无效")
	private Integer validStatus;

	/**
	 *  创建人ID
     */
	@ApiModelProperty("创建人ID")
	private Long createUserId;

	/**
	 *  创建人名称
     */
	@ApiModelProperty("创建人名称")
	private String createUserName;

	/**
	 *  创建日期
     */
	@ApiModelProperty("创建日期")
	private Date createTime;

	/**
	 *  修改人ID
     */
	@ApiModelProperty("修改人ID")
	private Long updateUserId;

	/**
	 *  修改人名称
     */
	@ApiModelProperty("修改人名称")
	private String updateUserName;

	/**
	 *  修改时间
     */
	@ApiModelProperty("修改时间")
	private Date updateTime;

	/**
	 *  是否删除 1：已删除 0：未删除
     */
	@ApiModelProperty("是否删除 1：已删除 0：未删除")
	private Integer isDel;
}
