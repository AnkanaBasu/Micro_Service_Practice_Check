package com.cognizant.menuitemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuitemservice.exception.MenuItemNotFoundException;
import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.service.MenuItemService;



@RestController
@RequestMapping("/menuitems")
public class MenuItemController {

	@Autowired
	private MenuItemService menuItemService;
	@GetMapping()
	public List<MenuItem> getMenuItemListAdmin() {
		
		return menuItemService.getMenuItemListAdmin();
	}
	@GetMapping("/user")
	public List<MenuItem> getMenuItemListCustomer() {
		return menuItemService.getMenuItemListCustomer();
	}
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id) throws MenuItemNotFoundException {
		return menuItemService.getMenuItem(id);
	}
	@PutMapping
	public void modifyMenuItem(@RequestBody MenuItem menuItem) {
		menuItemService.modifyMenuItem(menuItem);
	}
}

