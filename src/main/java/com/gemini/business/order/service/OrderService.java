package com.gemini.business.order.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.order.mapper.OrderMapper;
import com.gemini.business.order.po.OrderPo;

/**
 * 订单表
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
public interface OrderService extends BaseDetailService<OrderPo, OrderPo, OrderMapper, OrderMapper> {
}