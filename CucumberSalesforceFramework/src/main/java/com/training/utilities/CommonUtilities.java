package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



	public class CommonUtilities {

	public String getproperty(String key) throws IOException {
			
	String path = "C:\\Users\\deeth\\eclipse-workspace\\CucumberSalesforceFramework\\properties\\application.properties";
    FileInputStream fileinput = new FileInputStream(path);
    Properties prop = new Properties();
    prop.load(fileinput);
	String value = prop.getProperty(key);
	return value;
		}
	}

