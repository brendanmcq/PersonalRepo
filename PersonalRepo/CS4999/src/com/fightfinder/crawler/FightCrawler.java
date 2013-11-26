package com.fightfinder.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FightCrawler {

	
	public static Document getHtmlDoc(String url){
		
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return doc;
	}
	

}
