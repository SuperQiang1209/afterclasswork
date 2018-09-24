package com.zhenggq.afterclasswork.pattern.strategy.pay;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 18:55
 * @Description:
 * @Version: 1.0
 */
public enum PayType {
    AliPay("Ali", new AliPay()), JDPay("Jd", new JDPay()), UNIONPay("Union", new UnionPay()), WeChat("Wechat", new WechatPay());

    private String type;
    private IPayMent ment;

    private PayType(String type, IPayMent ment) {
        this.type = type;
        this.ment = ment;
    }

    public static PayType get(String key) {
        if (null == key) {
            return null;
        }
        for (PayType p : PayType.values()) {
            if (p.type.equals(key)) {
                return p;
            }
        }
        return null;

    }

    public IPayMent get() {
        return this.ment;
    }


}
