package cn.net.susan.entity.sys;

import cn.net.susan.entity.RequestPageEntity;
import lombok.Data;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色查询条件实体
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@ApiModel("角色查询条件实体")
@Data
public class RoleConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  名称
     */
	@ApiModelProperty("名称")
	private String name;

	/**
	 *  备注
     */
	@ApiModelProperty("备注")
	private String remark;

	/**
	 *  数据权限
     */
	@ApiModelProperty("数据权限")
	private String dataScope;

	/**
	 *  角色级别
     */
	@ApiModelProperty("角色级别")
	private Integer level;

	/**
	 *  功能权限
     */
	@ApiModelProperty("功能权限")
	private String permission;

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
