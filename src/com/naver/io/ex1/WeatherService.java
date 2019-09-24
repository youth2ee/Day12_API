package com.naver.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class WeatherService {
	
	private StringBuffer sb;
	private StringTokenizer st;
	private Scanner sc;
	
	public WeatherService() {
		
	}
	
	
	public void init(ArrayList<Weather> weathers) {
		//날씨정보초기화
		//weatherInfo.txt 읽어서
		//어레이리스트 해시맵 중 하나
		//파싱, 객체를 모아서 리턴
		
		File file = new File("c:\\test", "WeatherInfo.txt");
		FileReader fr=null;
		BufferedReader br=null;
		
		
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			sb = new StringBuffer();
			
			boolean check =true;
			while(check) {
				String str = br.readLine();
				sb.append(str);
				if(str==null) {
					break;
				}
				System.out.println(str);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		st = new StringTokenizer(sb.toString(),",");

		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			
			weathers.add(weather);
		}
	}//init
	
	
	
	public void addWeather(ArrayList<Weather> weathers) { //2번
		sc = new Scanner(System.in);

			Weather weather = new Weather();
			
			System.out.println("추가할 도시");
			weather.setCity(sc.next().toUpperCase());
			System.out.println("기온");
			weather.setGion(sc.nextDouble());
			System.out.println("습도");
			weather.setHumidity(sc.nextInt());
			System.out.println("상태");
			weather.setStatus(sc.next());
			
			weathers.add(weather);		
	}//2
	
	public Weather fineWeather(ArrayList<Weather> weathers) { //4번
		sc = new Scanner(System.in);
		
		System.out.println("찾을 도시의 이름");
		String city = sc.next().toUpperCase();
		
		Weather weather = null;
		
		for(int i=0;i<weathers.size();i++) {
			if(weathers.get(i).getCity().equals(city)) {
				weather = weathers.get(i);
				break;
			}
		}
		return weather;
		
	}//4
	
	
	

}
