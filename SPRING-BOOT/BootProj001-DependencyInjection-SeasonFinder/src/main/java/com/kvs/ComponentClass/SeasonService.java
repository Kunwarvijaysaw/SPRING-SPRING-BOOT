package com.kvs.ComponentClass;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeasonService {
	@Autowired
        LocalDateTime ldate;
	public String getSeason(){
		
		int month2 = ldate.getMonthValue();
		
		if(month2>=3 && month2<=6) {
			//System.out.println(month);
			  return "Summer Season";
		}else if(month2>=7 && month2<=10) {
			return "Rainy season";
			
		}else {
			return "Winter season";
		}
		
	}
}
