package com.lambdaschool.crudyrestaurants.services;


import com.lambdaschool.crudyrestaurants.models.Payment;
import com.lambdaschool.crudyrestaurants.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@Service(value="paymentservices")
public class PaymentServicesImpl implements PaymentServices {
	@Autowired
	private PaymentRepository paymentRepository;

	@Transactional
	@Override
	public Payment save(Payment payment) {
		return paymentRepository.save(payment);
	}

}
