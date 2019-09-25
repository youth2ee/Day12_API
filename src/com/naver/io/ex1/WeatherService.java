package com.naver.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	private StringTokenizer st;
	private Scanner sc;

	public WeatherService() {
		sc = new Scanner(System.in);
	}

	public ArrayList<Weather> init() { //1번
		
		ArrayList<Weather> weathers = new ArrayList<Weather>();
		
		//날씨정보초기화
		//weatherInfo.txt 읽어서
		//어레이리스트 해시맵 중 하나
		//파싱, 객체를 모아서 리턴

		File file = new File("c:\\test", "WeatherInfo.txt");
		FileReader fr =null;
		BufferedReader br =null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			boolean check =true;
			while(check) {
				String str = br.readLine();
				if(str==null) {
					break;
				}
				Weather weather = new Weather();
				
				/*1) 토크나이저로 자르기
				//str = str.replace(" ","");
				//토큰을 받아서 trim 해줘도 빈칸을 없애준다.
				st = new StringTokenizer(str,",");
	
				//while(st.hasMoreTokens()) { //while문 안써도 어짜피 한번밖에 안돈다.
				// 한줄 받아서 아래를 돌리고 바로 위로 올라가서 다음 줄을 받기 때문에 while문 필요없다.
					weathers.add(weather); //어짜피 그 주소를 받는것이므로 위에서 받아도 된다.
			
					weather.setCity(st.nextToken().trim().toUpperCase());
					weather.setGion(Double.parseDouble(st.nextToken().trim()));
					weather.setHumidity(Integer.parseInt(st.nextToken().trim()));
					weather.setStatus(st.nextToken().trim());
					*/
				
				//2. split으로 자르기
					String [] w = str.split(",");
					weather.setCity(w[0].trim().toUpperCase());
					weather.setGion(Double.parseDouble(w[1].trim()));
					weather.setHumidity(Integer.parseInt(w[2].trim()));
					weather.setStatus(w[3].trim());
					weathers.add(weather); 
				//}
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //해제는 연결의 역순으로
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return weathers;
	}//init



	public void addWeather(ArrayList<Weather> weathers) {//4번

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
	} //addWeather

	
	public Weather fineWeather(ArrayList<Weather> weathers) {//3번, 5번

		System.out.println("도시의 이름");
		String city = sc.next().toUpperCase();

		Weather weather = null;

		for(int i=0;i<weathers.size();i++) {
			if(weathers.get(i).getCity().equals(city)) {
				weather = weathers.get(i);
				break;
			}
		}
		return weather;

	}//fineWeather

	
	//fineWeather을 받아서 이용, 5번
	public ArrayList<Weather> deleteWeather(ArrayList<Weather> weathers, Weather weather) {

		weathers.remove(weather);

		return weathers;
	}//deleteWeather





}
