package com.fightfinder.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.nodes.Document;

import com.fightfinder.Worker.FightWorker;
import com.fightfinder.crawler.FightCrawler;
import com.fightfinder.entity.FightEvent;

/**
 * Servlet implementation class EventServlet
 */
public class EventServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp){
		
		String url = "http://www.sherdog.com/events";
		Document doc = FightCrawler.getHtmlDoc(url);
		ArrayList<FightEvent> events = FightWorker.gatherFightEvents(doc);
		req.setAttribute("events", events);
		
		String targetUrl = "/index.jsp";
		try {
			forward(targetUrl, req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
