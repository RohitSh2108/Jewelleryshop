package com.service;

import com.entity.Category;

public interface CategoryService {
	
	//use throws for throwing appropriate Exceptions with functions
		public String addCategory(Category category);

		public String removeCategory(int categoryId);

		public String updateCategory(int categoryId);

		public Category searchCategoryByName(String name);

		public Category searchCategoryById(int id);

}
