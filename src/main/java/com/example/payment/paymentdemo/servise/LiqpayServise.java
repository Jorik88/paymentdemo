package com.example.payment.paymentdemo.servise;

import org.springframework.stereotype.Service;
import com.liqpay.LiqPay;


import java.util.HashMap;
import java.util.Map;

@Service
public class LiqpayServise {

    public void m1() {
        Map params = new HashMap();
        params.put("amount", "1.50");
        params.put("currency", "USD");
        params.put("description", "description text");
        params.put("order_id", "order_id_1");
        params.put("sandbox", "1"); // enable the testing environment and card will NOT charged. If not set will be used property isCnbSandbox()
        LiqPay liqpay = new LiqPay("", "");
        String html = liqpay.cnb_form(params);
        System.out.println(html);
    }
}
