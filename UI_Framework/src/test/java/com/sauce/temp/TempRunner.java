package com.sauce.temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.sauce.base.TestBase;

public class TempRunner {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\sauce\\config\\config.properties");
		prop.load(fis);
		
		//System.out.println(System.getProperty("user.dir"));
		System.out.println(prop.getProperty("timeout"));
		
		TestBase testbase= new TestBase();
		testbase.intialization();

	}

}
