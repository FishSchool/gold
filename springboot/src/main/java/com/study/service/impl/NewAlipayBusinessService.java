package com.study.service.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.study.alipay.AlipayConfig;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * 新的阿里支付页面服务类
 * <p>
 * 阿里升级接口之后使用这个服务类
 *
 * @author   WangSen(wangsenhehe@126.com)
 * @Date     2017年8月16日
 */
@Data
@Service
public class NewAlipayBusinessService {
    /**
     * 阿里的配置文件对象
     */
    private AlipayConfig alipayConfig;
    /**
     * 构建支付请求
     *
     * @param orderId 订单号
     * @param payPrice 付款金额
     * @param orderName 订单名称
     * @param body 商品描述
     *
     * @return html字符串
     */
    public String buildPayRequest(long orderId, long payPrice, String orderName, String body) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = getAlipayClient();
        //设置请求参数
        String bizContent = getBizContent(String.valueOf(orderId), String.valueOf(payPrice), orderName,
                body);
        return alipayClient.pageExecute(setAlipayRequestParameters(bizContent)).getBody();
    }
    /**
     * 设置阿里支付请求参数
     *
     * @param bizContent 包含关键参数的json字符串
     *
     * @return AlipayTradePagePayRequest对象
     */
    private AlipayTradePagePayRequest setAlipayRequestParameters(String bizContent) {
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(alipayConfig.getReturn_url());
        alipayRequest.setNotifyUrl(alipayConfig.getNotify_url());
        alipayRequest.setBizContent(bizContent);
        return alipayRequest;
    }
    private AlipayClient getAlipayClient() {
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, alipayConfig.getApp_id(),
                alipayConfig.getMerchant_private_key(), "json", AlipayConfig.charset,
                alipayConfig.getAlipay_public_key(), AlipayConfig.sign_type);
        return alipayClient;
    }
    /**
     * 获取业务的关键内容
     *
     * @param out_trade_no 订单号
     * @param total_amount 付款金额
     * @param subject 订单名称
     * @param body 商品描述
     *
     * @return 拼接之后的json字符串
     */
    private String getBizContent(String out_trade_no, String total_amount, String subject, String body) {
//        ExceptionUtil.checkEmpty(out_trade_no, "订单号不能为空");
//        ExceptionUtil.checkEmpty(total_amount, "价格不能为空");
//        ExceptionUtil.checkEmpty(subject, "订单名称不能为空");
//        ExceptionUtil.checkEmpty(body, "商品描述不能为空");


        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"out_trade_no\":\"").append(out_trade_no).append("\",");
        sb.append("\"total_amount\":\"").append(total_amount).append("\",");
        sb.append("\"subject\":\"").append(subject).append("\",");
        sb.append("\"body\":\"").append(body).append("\",");
        sb.append("\"product_code\":\"FAST_INSTANT_TRADE_PAY\"");
        sb.append("}");
        return sb.toString();
    }

}