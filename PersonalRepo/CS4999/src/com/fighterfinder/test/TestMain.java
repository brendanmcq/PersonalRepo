package com.fighterfinder.test;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fighterfinder.crawler.FightCrawler;

public class TestMain {

	/**
	 * @param args
	 */
	//http://jsoup.org/apidocs/
	public static void main(String[] args) {
			FightCrawler crawler = new FightCrawler();
			String url = "http://www.sherdog.com/events";
			Document doc = crawler.getHtmlDoc(url);
			Elements elements = doc.getElementById("events_list").getElementsByTag("meta");
			for(Element element : elements){
			System.out.println(element);
			System.out.println("attr: " + element.attr("content"));
			System.out.println("***");
			}
			
	}
}
