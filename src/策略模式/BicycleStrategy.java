package ����ģʽ;

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
 * Description:�������2
 * Company:chaoxing
 * @author:�ߺ�
 * @date:2017��7��7��
 */
public class BicycleStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		// TODO Auto-generated method stub
		System.out.println("����2:�����г�");
		
	}
/*public static void main(String[] args) throws ParseException {
 
	 Calendar now = Calendar.getInstance();  
     System.out.println("��: " + now.get(Calendar.YEAR));  
     System.out.println("��: " + (now.get(Calendar.MONTH) + 1) + "");  
     System.out.println("��: " + now.get(Calendar.DAY_OF_MONTH));  
     System.out.println("ʱ: " + now.get(Calendar.HOUR_OF_DAY));  
     System.out.println("��: " + now.get(Calendar.MINUTE));  
     System.out.println("��: " + now.get(Calendar.SECOND));  
     System.out.println("��ǰʱ���������" + now.getTimeInMillis());   
     System.out.println(now.getFirstDayOfWeek());
     now.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
     System.out.println(now.getTime().get);
     SimpleDateFormat ��ʽ=new SimpleDateFormat("y��M��d�� E Hʱm��s��",Locale.CHINA);
     Calendar ����=Calendar.getInstance(Locale.CHINA);
     ����.setFirstDayOfWeek(Calendar.MONDAY);
     //��ǰʱ�䣬ò�ƶ��࣬��ʵ��Ϊ�����п��ܵ�ϵͳһ��
     ����.setTimeInMillis(System.currentTimeMillis());
     System.out.println("��ǰʱ��:"+��ʽ.format(����.getTime()));
     ����.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
     System.out.println("��һʱ��:"+��ʽ.format(����.getTime()));
     ����.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
     System.out.println("��һʱ��:"+��ʽ.format(����.getTime()));

  
	 
}*/


/** 
 * �������ڻ�������ܵ�����  
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
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEE");//EEE�������ڼ�  
    Date currentDate = new Date();  
    List<Date> days = dateToWeek(currentDate);  
    System.out.println("���������: " + sdf.format(currentDate));  
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
 * �õ�������ʱ�� 
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
