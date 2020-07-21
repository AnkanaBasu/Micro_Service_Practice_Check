package com.cognizant.menuitemservice.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menuitemservice.exception.MenuItemNotFoundException;
import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.repository.MenuItemRepository;


@Service
public class MenuItemServiceImpl implements MenuItemService {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemService.class);
	@Autowired
	private MenuItemRepository menuItemRepository;
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		LOGGER.info("start");
		return menuItemRepository.getMenuItemListCustomer(new Date());
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("start");
		try {
			MenuItem item=getMenuItem(menuItem.getId());
		}
		catch(MenuItemNotFoundException e) {
			e.printStackTrace();
		}
		 menuItemRepository.save(menuItem);
		LOGGER.info("end");

	}

	@Override
	public MenuItem getMenuItem(long id) throws MenuItemNotFoundException {
		LOGGER.info("start");
		MenuItem item= menuItemRepository.getOne(id);
		if(item!=null) {
			return item;
		}
		else {
			throw new MenuItemNotFoundException("item not found");
		}
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("start");
		return menuItemRepository.findAll();
	}

}
