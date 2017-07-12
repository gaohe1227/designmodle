package 访问者模式;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Element> lists=ObjectStruture.elementLists();
       for (Element element : lists) {
    	   element.accept(new VisitorImpl());
	}
	}

}
