package CucumberProject.CucumberProject;

public class Test {
	
	enum Mobile{
		SAMSUNG(100),APPLE(500),SONY(50);
		
		int price;
		
	
		Mobile(int p){
			this.price=p;
		}


		public int getPrice() {
			return price;
		}


	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("APPLE PRICE"+Mobile.APPLE.getPrice());
		System.out.println("SAMSUNG PRICE"+Mobile.SAMSUNG.getPrice());
		System.out.println("SONY PRICE"+Mobile.SONY.getPrice());

		
	}

}
