package relationship;

public class MyDate {
   int dd,mm,yy;
   public MyDate() {
	   dd=13;
	   mm=11;
	   yy=2000;
   }
   public MyDate(int dd,int mm,int yy) {
	   this.dd=dd;
	   this.mm=mm;
	   this.yy=yy;
   }
   public void display() {
	   System.out.println("Date is "+dd+"-"+mm+"-"+yy);
   }
}
