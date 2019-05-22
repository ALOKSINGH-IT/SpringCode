package com.bm.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class CacheManager {
	
	
	Cache cache;

	public CacheManager(Cache cache) {
		//super();
		this.cache = cache;
		
		loadProperty();
	}
	
	
	public void loadProperty()
	{
		
		
		//get the property file 
		
		try {
			FileInputStream is=new FileInputStream("ri.properties");
			
			Properties p=new Properties();
			
				p.load(is);
				
				Set<Object> key=p.keySet();
				
				for(Object keys:key)
				{
					//System.out.println(keys);
					String value=(String) p.get(keys);
					
					cache.put(keys.toString(), Double.parseDouble(value));
				}
				
				//System.out.println(cache.get("IBM"));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	

}
