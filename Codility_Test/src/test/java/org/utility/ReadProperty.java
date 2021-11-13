package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static String returnvalue(String Name) throws IOException {

		String loc = System.getProperty("user.dir") + "//src//test//java//org//config//Config.Properties";

		FileInputStream fis = new FileInputStream(new File(loc));

		Properties P = new Properties();
		P.load(fis);
		String value = P.getProperty(Name);
		return value;

	}

}
