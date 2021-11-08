package com.jaker.springcloud.servic.impl;

import com.jaker.springcloud.dao.PaymentDao;
import com.jaker.springcloud.entities.Payment;
import com.jaker.springcloud.servic.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Resource
	public PaymentDao paymentDao;


	public int create(Payment payment) {
		return paymentDao.create(payment);
	}


	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
