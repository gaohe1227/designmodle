package ������ģʽ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * Description:�ṹ����:һ��Ԫ�ص�������һ�����һ�����ɶ����ͬ�ࡢ��ͬ�ӿڵ���������List��Set��Map�ȣ�����Ŀ��һ����ٳ���������ɫ
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class ObjectStruture {
  public static List<Element> elementLists(){
	  List<Element> list=new ArrayList<>();
	  Random random=new Random();
	  for(int i=0; i<10; i++){  
          int a = random.nextInt(100);  
          if(a>50){  
              list.add(new ConcreteElement1());  
          }else{  
              list.add(new ConcreteElement2());  
          }  
      }
	return list;  
  }
}
