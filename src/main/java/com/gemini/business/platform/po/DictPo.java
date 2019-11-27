package com.gemini.business.platform.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseSubPo;
import lombok.Data;

/**
 * 字典表
 *
 * @author 小明不读书
 */
@Data
@TableName("platform_dict")
public class DictPo extends BaseSubPo<DictPo> {

    /**
     * 字典编码
     */
    private String code;

    /**
     * 字典名称
     */
    private String name;

    /**
     * 备注
     */
    private String description;
}
