package com.gemini.business.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.business.platform.po.OrgPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 组织架构表
 *
 * @author 小明不读书
 */
@Mapper
public interface OrgMapper extends BaseMapper<OrgPo> {
}
