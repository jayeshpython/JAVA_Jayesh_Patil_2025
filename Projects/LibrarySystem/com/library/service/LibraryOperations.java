
package com.library.service;

import com.library.bean.Item;

public  interface LibraryOperations
{
	void addNewItem(Item item);
	void displayAllItem();
	void removeItem(int id);
	Item searchItem(int id);
}