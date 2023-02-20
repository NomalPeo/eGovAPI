package egovframework.example.controller;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.io.BufferedReader;
import java.io.IOException;
@org.springframework.stereotype.Controller
public class ApiExplorer {
	
	
	@RequestMapping(value="/choose.do")
	public String choose() {
		return "choose";
	}
	
	
	
   @RequestMapping(value="/main.do")
   public String main(Model model, HttpServletRequest request) throws IOException {
      String result = "";
      LocalDate now = LocalDate.now();
      
      // 포맷 정의
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
     
      // 포맷 적용
      String formatedNow = now.format(formatter);

      // 결과 출력
      System.out.println(formatedNow);  // 2021/06/17

      String area = request.getParameter("area");
      
      String x = area.substring(0,2);
      String y = area.substring(2);
      System.out.println(x);
      System.out.println(y);
      
      System.out.println(area);
      try {
         StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); /*URL*/
         urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=RjX6YKU%2F02B%2B%2Fg7%2Fo6OPjt4UJc70W54KMz9IDthDPgr3j2kFKKe%2FusdVBzYLZ4QyQeXraQxni9oxLuRUqCpJaQ%3D%3D"); /*Service Key*/
         urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
         urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
         urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
         urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(formatedNow, "UTF-8")); /*‘21년 6월 28일 발표*/
         urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0900", "UTF-8")); /*06시 발표(정시단위) */
         urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode(x, "UTF-8")); /*예보지점의 X 좌표값*/
         urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode(y, "UTF-8")); /*예보지점의 Y 좌표값*/
         URL url = new URL(urlBuilder.toString());
         BufferedReader rd;
         rd = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
         result = rd.readLine();
         model.addAttribute("list",result);

         JSONParser jsonparser = new JSONParser();

         JSONObject jsonObject = (JSONObject)jsonparser.parse(result);
         JSONObject response = (JSONObject)jsonObject.get("response");
         JSONObject body = (JSONObject)response.get("body");
         JSONObject items = (JSONObject)body.get("items");
         JSONArray item = (JSONArray)items.get("item");
         
         model.addAttribute("list1",item);
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      return "main";
   }
}