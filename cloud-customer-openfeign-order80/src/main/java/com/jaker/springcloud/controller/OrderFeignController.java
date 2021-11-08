package com.jaker.springcloud.controller;

import com.jaker.springcloud.entities.CommonResult;
import com.jaker.springcloud.entities.Payment;
import com.jaker.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {

	public final static String PAYMENT_URL="http://localhost:8001";

	@Resource
	private PaymentFeignService paymentFeignService;

	@GetMapping(value = "/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
		return paymentFeignService.getPaymentById(id);
	}

}
