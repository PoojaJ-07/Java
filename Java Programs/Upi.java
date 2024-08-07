class Upi{

 long mobileNo;
 String bankName;

 Upi(long mobileNo,String bankName)
 {
	 System.out.println("Creates constructor using long and String");
	 this.mobileNo=mobileNo;
	 this.bankName=bankName;
 }
 
 public void details()
 {
	 System.out.println("UPI mobileNo:"+this.mobileNo);
	 System.out.println("UPI Bank name:"+this.bankName); 
 }
}