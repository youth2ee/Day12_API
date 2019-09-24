package com.naver.io.ex1;

import java.util.ArrayList;


public class WeatherView {
	
	//메서드명 view
	//모든 지역의 날씨 전체 정보를 출력
	public void view(ArrayList<Weather> weathers) {
		
		for(int i=0;i<weathers.size();i++) {
			System.out.println("도시 : "+weathers.get(i).getCity());
			System.out.println("기온 : "+weathers.get(i).getGion());
			System.out.println("습도 : "+weathers.get(i).getHumidity());
			System.out.println("상태 : "+weathers.get(i).getStatus());
			System.out.println("================");
		}
	}
	
	//메서드명 view
	//한 지역의 날씨 정보를 출력
	public void view(Weather weather) {
		System.out.println("도시 : "+weather.getCity());
		System.out.println("기온 : "+weather.getGion());
		System.out.println("습도 : "+weather.getHumidity());
		System.out.println("상태 : "+weather.getStatus());
		System.out.println("================");
		
	}
	

}
