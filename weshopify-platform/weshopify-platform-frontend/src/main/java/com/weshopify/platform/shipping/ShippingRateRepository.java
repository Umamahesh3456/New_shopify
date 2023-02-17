package com.weshopify.platform.shipping;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.Country;
import com.weshopify.platform.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
