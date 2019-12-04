package com.gemini.business.order.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;


/**
 *
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
@Data
@TableName("order_history")
public class OrderHistoryPo extends BaseDetailPo<OrderHistoryPo> {

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;
}
