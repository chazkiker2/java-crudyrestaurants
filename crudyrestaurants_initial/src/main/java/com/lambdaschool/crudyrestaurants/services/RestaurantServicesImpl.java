package com.lambdaschool.crudyrestaurants.services;


import com.lambdaschool.crudyrestaurants.models.Restaurant;
import com.lambdaschool.crudyrestaurants.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@Service(value = "restaurantservices")
public class RestaurantServicesImpl
		implements RestaurantServices {
	private RestaurantRepository restaurantRepository;

	@Autowired
	public RestaurantServicesImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	@Transactional
	@Override
	public Restaurant save(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

}
