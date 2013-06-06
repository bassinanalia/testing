import java.util.Date;


public class Taller9 {

	public static void main (String[] args){
		
		int j= 10;
		Customer[] cus = new Customer[j];
		
		for (int k =0;k<j; k++){
			cus[k] = new Customer();
	}
		
		for(Customer c: cus){
		System.out.println(c);
		}
		
//		System.out.println(cus[0].equals(cus[1]));
	/*	int i= 0;
		do{
			System.out.println( new Customer () );
			i++;
		}while (i<10);
		
		Customer c1 = new Customer();
		Customer c2 = new Customer ("Gabriel", "Capilla", new Date());
	*/	
	}
	
}
