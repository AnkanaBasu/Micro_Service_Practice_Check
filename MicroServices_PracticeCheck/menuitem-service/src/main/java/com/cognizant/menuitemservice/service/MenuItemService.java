package com.cognizant.menuitemservice.service;

import java.util.List;

import javax.transaction.Transactional;

import com.cognizant.menuitemservice.exception.MenuItemNotFoundException;
import com.cognizant.menuitemservice.model.MenuItem;



public interface MenuItemService {
	@Transactional
	List<MenuItem> getMenuItemListAdmin();
	@Transactional
	List<MenuItem> getMenuItemListCustomer();
	@Transactional
	void modifyMenuItem(MenuItem menuItem);
	@Transactional
	MenuItem getMenuItem(long id) throws MenuItemNotFoundException;
}
