package com.naver.io.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	ArrayList<Weather> weathers;
	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;
	
	public WeatherMenu() {
		weathers = new ArrayList<Weather>();
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wv = new WeatherView();
	}
	
	public void start() {
		/*
		 * 1. 날씨정보 초기화
		 * 2. 날씨정보 전체출력
		 * 3. 날씨정보 일부출력
		 * 4. 날씨정보 추가
		 * 5. 날씨정보 삭제
		 * 6. 종료
		 */
	boolean check = true;
		
		while(check) {
		System.out.println("1. 날씨정보초기화");
		System.out.println("2. 날씨정보 전체출력");
		System.out.println("3. 날씨정보 일부출력");
		System.out.println("4. 날씨정보 추가");
		System.out.println("5. 날씨정보 삭제");
		System.out.println("6. 종료");
		
		int num = sc.nextInt();
		
		switch(num){
		case 1:
			weathers = ws.init();
			wv.view(weathers);
			break;
			
		case 2:
			wv.view(weathers);
			break;
			
		case 3:
			Weather weather = ws.fineWeather(weathers);
			wv.view(weather);
			break;
			
		case 4:
			ws.addWeather(weathers);
			break;
			
		case 5:
			weather = ws.fineWeather(weathers);
			ws.deleteWeather(weathers, weather);
			break;
		case 6:
			System.out.println("종료합니다.");
			check=!check;
		}
		
		
		}
		
		
		
		
	}//start

}
