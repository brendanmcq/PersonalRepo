package com.fightfinder.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fightfinder.entity.FightEvent;

public class FightWorker {

	public static ArrayList<FightEvent> gatherFightEvents(Document doc) {
		ArrayList<FightEvent> fightEvents = new ArrayList<FightEvent>();

		Elements elements = doc.getElementById("events_list").getElementsByTag(
				"meta");
		Elements cleanElements = new Elements();

		for (Element elem : elements) {
			if (elem.attr("itemprop").equals("startDate")) {
				
				String dateStr = formatDateString(elem.attr("content"));

				SimpleDateFormat formatter = new SimpleDateFormat(
						"yyyy-MM-dd hh:mm", Locale.ENGLISH);

				Date date = null;
				try {
					date = formatter.parse(dateStr);

				} catch (ParseException e) {
					e.printStackTrace();
				}


				if (date.after(new Date())) {
					int index = elements.indexOf(elem);
					Element nextElem = elements.get(index + 1);
					cleanElements.add(elem);
					cleanElements.add(nextElem);
				}

			}
		}

		//System.out.println(cleanElements);
		for (Element element : cleanElements) {

			FightEvent event = new FightEvent();
			if (element.attr("itemprop").equals("name")) {
				if (element.attr("content").contains("UFC")
						|| element.attr("content")
								.contains("Ultimate Fighter")
						|| element.attr("content").contains(
								"Glory World Series")
						|| element.attr("content").contains("WSOF")
						|| element.attr("content").contains("Bellator")) {

					int index = elements.indexOf(element);
					Element previousElem = elements.get(index - 1);
					
					String dateStr = formatDateString(previousElem.attr("content"));
					
					event.setEventName(element.attr("content"));
					event.setEventDate(dateStr);
					//System.out.println(event);
					
					fightEvents.add(event);
				}
			}
	
		}
		//System.out.println(fightEvents);
		return fightEvents;
	}
	
	private static String formatDateString(String date){
		
		String dateStr = date;

		dateStr = dateStr.substring(0, 10) + " "
				+ dateStr.substring(20, dateStr.length());

		return dateStr;
	}

}
