package com.naver.io.ex1;

import java.util.ArrayList;


public class WeatherView {

	//메서드명 view
	//모든 지역의 날씨 전체 정보를 출력
	public void view(ArrayList<Weather> weathers) {
		/* 일반적 for문 (인덱스 번호가 필요할 떄 사용)
		for(int i=0;i<weathers.size();i++) {
			System.out.println("도시 : "+weathers.get(i).getCity());
			System.out.println("기온 : "+weathers.get(i).getGion());
			System.out.println("습도 : "+weathers.get(i).getHumidity());
			System.out.println("상태 : "+weathers.get(i).getStatus());
			System.out.println("================");
		}
		 */

		//향상된 for문 (단순히 출력용일때는 이게 편리)
		//for(저장된 데이터타입 변수명:컬렉션의 변수명)
		//weathers에서 weather를 하나 겟해서 넣어라. 자기가 알아서 개수만큼 넣는다 
		for(Weather fNew : weathers) {
			System.out.println(fNew.getCity());
			System.out.println(fNew.getGion());
			System.out.println(fNew.getHumidity());
			System.out.println(fNew.getStatus());
			System.out.println("================");
		}
	}//view 메서드


	//메서드명 view
	//한 지역의 날씨 정보를 출력
	public void view(Weather weather) {
		System.out.println("도시 : "+weather.getCity());
		System.out.println("기온 : "+weather.getGion());
		System.out.println("습도 : "+weather.getHumidity());
		System.out.println("상태 : "+weather.getStatus());
		System.out.println("================");
	}//view 메서드
	
	
} //WeatherView 클래스
