package com.cmsblogs.base.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawlerTest {
	public static  void main(String[] args) throws IOException{  
	    String url = "http://cmsblogs.com/?p=1662";  
	    long start = System.currentTimeMillis();  
	    Document doc=null;  
	    try{  
	        doc = Jsoup.connect(url).get();  
	    }  
	    catch(Exception e){  
	        e.printStackTrace();  
	    }  
	    finally{  
	        System.out.println("Time is:"+(System.currentTimeMillis()-start) + "ms");  
	    }  
	    Elements elem = doc.getElementsByTag("article");  
	    System.out.println("Title is:" +elem.text());  
	    }     
}
