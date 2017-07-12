package µü´úÆ÷Ä£Ê½;

public class NameRepository implements MyContainer {

	 public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	   @Override
	   public MyIterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements MyIterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
}
