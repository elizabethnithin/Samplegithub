package Encapsulation;

public class Data {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj = new Customer();
		obj.setMail("elizabeth@gmmail.com");
		obj.setAcc(855555);
		obj.setBal(20000);
		
		System.out.println(" customer mail is : " +obj.getMail());
		System.out.println("account number is : " +obj.getAcc());
		System.out.println("account balance is :" +obj.getBal());
		

	}

}
