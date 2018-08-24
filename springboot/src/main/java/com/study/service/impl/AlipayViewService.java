package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * 阿里支付页面服务类
 *
 * @author   WangSen(wangsenhehe@126.com)
 * @Date     2017年8月16日
 */
@Service
public class AlipayViewService {
    @Autowired
    private NewAlipayBusinessService newAlipayBusinessService;
    /**
     * 设置去支付信息
     *
     * @param orderId 订单id
     * @param model 模型
     *
     * @return 构建的字符串
     */
    public void setGoToPayInfo(long orderId, Model model,long payPrice) throws Exception {
        model.addAttribute("htmlStr", newAlipayBusinessService.buildPayRequest(orderId,
                payPrice, "报名费", "略"));
    }
}
