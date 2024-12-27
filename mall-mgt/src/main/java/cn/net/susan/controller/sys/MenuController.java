package cn.net.susan.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.susan.entity.ResponsePageEntity;
import cn.net.susan.entity.sys.MenuConditionEntity;
import cn.net.susan.entity.sys.MenuEntity;
import cn.net.susan.service.sys.MenuService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 菜单 接口层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 17:18:18
 */
@Api(tags = "菜单操作", description = "菜单接口")
@RestController
@RequestMapping("/v1/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;

	/**
	 * 通过id查询菜单信息
	 *
	 * @param id 系统ID
	 * @return 菜单信息
	 */
	@ApiOperation(notes = "通过id查询菜单信息", value = "通过id查询菜单信息")
	@GetMapping("/findById")
	public MenuEntity findById(Long id) {
		return menuService.findById(id);
	}

	/**
    * 根据条件查询菜单列表
    *
    * @param menuConditionEntity 条件
    * @return 菜单列表
    */
	@ApiOperation(notes = "根据条件查询菜单列表", value = "根据条件查询菜单列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<MenuEntity> searchByPage(@RequestBody MenuConditionEntity menuConditionEntity) {
		return menuService.searchByPage(menuConditionEntity);
	}


	/**
     * 添加菜单
     *
     * @param menuEntity 菜单实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加菜单", value = "添加菜单")
	@PostMapping("/insert")
	public int insert(@RequestBody MenuEntity menuEntity) {
		return menuService.insert(menuEntity);
	}

	/**
     * 修改菜单
     *
     * @param menuEntity 菜单实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改菜单", value = "修改菜单")
	@PostMapping("/update")
	public int update(@RequestBody MenuEntity menuEntity) {
		return menuService.update(menuEntity);
	}

	/**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return 影响行数
     */
	@ApiOperation(notes = "删除菜单", value = "删除菜单")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return menuService.deleteById(id);
	}
}
