package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.linkedhashset_crud_operation.LinkedHashSetCrudOperation;

public class MainDriver
{
	static LinkedHashSetCrudOperation linkedHashSetCrudOperation = new LinkedHashSetCrudOperation();
	public static void main(String[] args)
	{
		linkedHashSetCrudOperation.createTheData();
		
		linkedHashSetCrudOperation.readTheData();
		
		linkedHashSetCrudOperation.updateTheData();
		
		linkedHashSetCrudOperation.deleteTheData();
	}
}