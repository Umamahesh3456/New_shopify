package com.weshopify.platform.setting;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
