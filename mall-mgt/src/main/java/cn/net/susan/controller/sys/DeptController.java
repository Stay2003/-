package cn.net.susan.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.sys.DeptConditionEntity;
import cn.net.susan.entity.sys.DeptEntity;
import cn.net.susan.service.sys.DeptService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 部门 接口层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:17
 */
@Api(tags = "部门操作", description = "部门接口")
@RestController
@RequestMapping("/v1/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	/**
	 * 通过id查询部门信息
	 *
	 * @param id 系统ID
	 * @return 部门信息
	 */
	@ApiOperation(notes = "通过id查询部门信息", value = "通过id查询部门信息")
	@GetMapping("/findById")
	public DeptEntity findById(Long id) {
		return deptService.findById(id);
	}

	/**
    * 根据条件查询部门列表
    *
    * @param deptConditionEntity 条件
    * @return 部门列表
    */
	@ApiOperation(notes = "根据条件查询部门列表", value = "根据条件查询部门列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<DeptEntity> searchByPage(@RequestBody DeptConditionEntity deptConditionEntity) {
		return deptService.searchByPage(deptConditionEntity);
	}


	/**
     * 添加部门
     *
     * @param deptEntity 部门实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加部门", value = "添加部门")
	@PostMapping("/insert")
	public int insert(@RequestBody DeptEntity deptEntity) {
		return deptService.insert(deptEntity);
	}

	/**
     * 修改部门
     *
     * @param deptEntity 部门实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改部门", value = "修改部门")
	@PostMapping("/update")
	public int update(@RequestBody DeptEntity deptEntity) {
		return deptService.update(deptEntity);
	}

	/**
     * 删除部门
     *
     * @param id 部门ID
     * @return 影响行数
     */
	@ApiOperation(notes = "删除部门", value = "删除部门")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return deptService.deleteById(id);
	}
}
