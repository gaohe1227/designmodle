package 策略模式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 
 * Title:BicycleStrategy
 * Description:具体策略2
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月7日
 */
public class BicycleStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		// TODO Auto-generated method stub
		System.out.println("策略2:骑自行车");
		
	}
/*public static void main(String[] args) throws ParseException {
 
	 Calendar now = Calendar.getInstance();  
     System.out.println("年: " + now.get(Calendar.YEAR));  
     System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");  
     System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));  
     System.out.println("时: " + now.get(Calendar.HOUR_OF_DAY));  
     System.out.println("分: " + now.get(Calendar.MINUTE));  
     System.out.println("秒: " + now.get(Calendar.SECOND));  
     System.out.println("当前时间毫秒数：" + now.getTimeInMillis());   
     System.out.println(now.getFirstDayOfWeek());
     now.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
     System.out.println(now.getTime().get);
     SimpleDateFormat 格式=new SimpleDateFormat("y年M月d日 E H时m分s秒",Locale.CHINA);
     Calendar 日历=Calendar.getInstance(Locale.CHINA);
     日历.setFirstDayOfWeek(Calendar.MONDAY);
     //当前时间，貌似多余，其实是为了所有可能的系统一致
     日历.setTimeInMillis(System.currentTimeMillis());
     System.out.println("当前时间:"+格式.format(日历.getTime()));
     日历.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
     System.out.println("周一时间:"+格式.format(日历.getTime()));
     日历.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
     System.out.println("周一时间:"+格式.format(日历.getTime()));

  
	 
}*/


/** 
 * 根据日期获得所在周的日期  
 * @param mdate 
 * @return 
 */  
@SuppressWarnings("deprecation")  
public static List<Date> dateToWeek(Date mdate) {  
    int b = mdate.getDay();  
 
    List<Date> list = new ArrayList<Date>();  
    Long fTime = mdate.getTime() - b * 24 * 3600000;  
    for (int a = 0; a < 7; a++) {  
    	Date  fdate = new Date();  
        fdate.setTime(fTime + (a * 24 * 3600000));  
        list.add(a, fdate);  
    }  
    return list;  
}  
public static void main(String[] args) throws ParseException {  
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEE");//EEE代表星期几  
    Date currentDate = new Date();  
    List<Date> days = dateToWeek(currentDate);  
    System.out.println("今天的日期: " + sdf.format(currentDate));  
    for (Date date : days) {  
        System.out.println(sdf.format(date));  
    }  
    System.out.println(new Date());
    
    
    System.out.println(getDateBefore(new Date(),19));
      
}   public static Date getDateBefore(Date d, int day) {  
    Calendar now = Calendar.getInstance();  
    now.setTime(d);  
    now.set(Calendar.DATE, now.get(Calendar.DATE) - day);  
    return now.getTime();  
}    
/** 
 * 得到几天后的时间 
 *  
 * @param d 
 * @param day 
 * @return 
 */  
public static Date getDateAfter(Date d, int day) {  
    Calendar now = Calendar.getInstance();  
    now.setTime(d);  
    now.set(Calendar.DATE, now.get(Calendar.DATE) + day);  
    return now.getTime();  
}
}
