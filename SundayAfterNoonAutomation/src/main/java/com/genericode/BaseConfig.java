package com.genericode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {

	protected String name = "sarower";

	protected String getConfigProperty(String data) throws Throwable {

		Properties obj = new Properties();
		FileInputStream fis = new FileInputStream("./Config.properties");

		obj.load(fis);

		String value = obj.getProperty(data);

		return value;
	}

}
