package com.fightfinder.test;

import java.util.ArrayList;

import org.jsoup.nodes.Document;

import com.fightfinder.Worker.FightWorker;
import com.fightfinder.crawler.FightCrawler;
import com.fightfinder.entity.FightEvent;

public class TestMain {

	/**
	 * @param args
	 */
	// http://jsoup.org/apidocs/
	public static void main(String[] args) {
		FightCrawler crawler = new FightCrawler();
		String url = "http://www.sherdog.com/events";
		Document doc = crawler.getHtmlDoc(url);
		ArrayList<FightEvent> events = FightWorker.gatherFightEvents(doc);
		
	}
}
