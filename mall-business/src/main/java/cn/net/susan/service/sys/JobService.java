package cn.net.susan.service.sys;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.net.susan.mapper.sys.JobMapper;
import cn.net.susan.entity.sys.JobConditionEntity;
import cn.net.susan.entity.sys.JobEntity;
import cn.net.susan.entity.ResponsePageEntity;

/**
 * 岗位 服务层
 * 
 * @author 思源 该项目是知识星球：java突击队 的内部项目
 * @date 2024-01-08 14:03:43
 */
@Service
public class JobService {

	@Autowired
	private JobMapper jobMapper;

	/**
     * 查询岗位信息
     * 
     * @param id 岗位ID
     * @return 岗位信息
     */
	public JobEntity findById(Long id) {
	    return jobMapper.findById(id);
	}
	
	/**
     * 根据条件分页查询岗位列表
     * 
     * @param jobConditionEntity 岗位信息
     * @return 岗位集合
     */
	public ResponsePageEntity<JobEntity> searchByPage(JobConditionEntity jobConditionEntity) {
		int count = jobMapper.searchCount(jobConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(jobConditionEntity);
		}
		List<JobEntity> dataList = jobMapper.searchByCondition(jobConditionEntity);
		return ResponsePageEntity.build(jobConditionEntity, count, dataList);
	}
	
    /**
     * 新增岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	public int insert(JobEntity jobEntity) {
	    return jobMapper.insert(jobEntity);
	}
	
	/**
     * 修改岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	public int update(JobEntity jobEntity) {
	    return jobMapper.update(jobEntity);
	}

	/**
     * 删除岗位对象
     * 
     * @param id 系统ID
     * @return 结果
     */
	public int deleteById(Long id) {
		return jobMapper.deleteById(id);
	}
	
}
