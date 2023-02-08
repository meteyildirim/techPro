package BahavioralDP.ObserverDP;

import java.util.ArrayList;

import java.util.List;

public class NewsChannel implements Channel {

	private List<String> newsList = new ArrayList<>();
	@Override
	public void update(String news) { // haber gelince ekle
		
		newsList.add(news);
		
		
	}

	@Override
	public void printNews() { // haberleri goster
		for (String news : newsList) {
			
			System.out.println(news);
			
		}
		
		
	}

}
