package com.fighterfinder.crawler;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.fightfinder.entity.FightEvent;

public class FightCrawler {

	
	public ArrayList<FightEvent> gatherFightEvents(String url){
		ArrayList<FightEvent> events = new ArrayList<FightEvent>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return events;
		
	}
	
	

}
