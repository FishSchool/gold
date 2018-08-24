package com.study.controller;

import com.study.service.impl.AlipayViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 阿里支付控制器
 *
 * @author   WangSen(wangsenhehe@126.com)
 * @Date     2017年8月16日
 */
@Controller
@RequestMapping("/alipay")
public class AliPayController {
    @Autowired
    private AlipayViewService alipayViewService;
    /**
     * 跳转到去支付的jsp页面
     *
     * @param orderId 订单号
     *
     *
     * @param model 模型
     *
     * @throws Exception
     */
    @RequestMapping
    public void gotoPay(long orderId, Model model,long payPrice) throws Exception {
        alipayViewService.setGoToPayInfo(orderId, model,payPrice);
    }
}
