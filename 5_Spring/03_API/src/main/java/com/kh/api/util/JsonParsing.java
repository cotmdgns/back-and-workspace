package com.kh.api.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serviceKey = "fEJKp%2BmJzWsMTXrJiAmzN5fF2QEnNoGiRlpIgs9cGW3jlgXZFBjBwQw3v%2B5em2ho2Q5Z28awd%2FJ9B%2BBdjPoyrg%3D%3D";
		String url = "https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey="+ 
						serviceKey +"&pageNo=1&numOfRows=10&resultType=json";
		
		try {
			URL requestUrl = new URL(url);
			HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
			urlConnection.setRequestMethod("GET");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line = null;
			
			StringBuffer responseBuffer = new StringBuffer();
			
			while((line = br.readLine())!=null) {
				responseBuffer.append(line);
			}
			br.close();
			urlConnection.disconnect();
			
			String responseData = responseBuffer.toString();
//			System.out.println(responseData);
			
			JSONObject jsonResponse = new JSONObject(responseData);
			
			JSONObject jsonData = jsonResponse.getJSONObject("getFoodKr");
			System.out.println(jsonData);
			
			JSONArray items = jsonData.getJSONArray("item");
			
//			for(Object json : items) { //뽑아올순있지만 json 에서는 비추
//				System.out.println(json);
//			}
			
			for(int i=0;i<items.length();i++) {
				JSONObject result = items.getJSONObject(i);
				System.out.println("MAIN_TITLE : " + result.getString("MAIN_TITLE"));
				System.out.println("LNG : " + result.getDouble("LNG"));
				System.out.println("LAT : " + result.getDouble("LAT"));
				System.out.println("------------------------");
			}
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
