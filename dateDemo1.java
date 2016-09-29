import java.util.Date;
 class dateDemo1{
	static long mills=System.currentTimeMillis();
  public static void main(String args[]){
      Date date=new Date(mills);   
      System.out.println(date);
    }
}
