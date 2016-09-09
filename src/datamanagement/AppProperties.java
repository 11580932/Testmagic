package datamanagement;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.io.*;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class AppProperties {
	private static AppProperties self = null;
	private Properties properties_;

	public static AppProperties getInstance() {
		if (self == null) {
			self = new AppProperties();
		}
		return self;
	}

	private AppProperties() {
		properties_ = new Properties();
		try {
			(     ( properties_).Load (new FileInputStream("Properties.prop"));
		} catch (IOException e) {
			throw new RuntimeException("Could not read property file");
		}
	}

	public Properties getProperties() {
		return properties_;
	}
}
