package com.fighterfinder.test;

import org.jsoup.nodes.Document;

import com.fighterfinder.crawler.FightCrawler;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			FightCrawler crawler = new FightCrawler();
			String url = "http://www.sherdog.com/events";
			Document doc = crawler.getHtmlDoc(url);
	}
}
