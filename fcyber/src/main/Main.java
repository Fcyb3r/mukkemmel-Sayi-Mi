package main;

public class Main {
	public static void main(String[] args) {
		/*
		 * Mükemmel sayı nedir? Kendisi hariç diğer pozitif tam bölenleri toplamı
		 * kendisine eşit olan sayı
		 * 
		 * 
		 * 6--->1,2,3bölenleri bunlardır 1+2+3=6
		 * 
		 * 28--->1,2,4,7,14bölenleri bunlar 1+2+4+7+14=28
		 * 
		 */
		int sayı = 6;
		int toplam = 0;

		for (int i = 1; i < sayı; i++) {

			if (sayı % i == 0) {

				
				toplam=toplam +i;
				
				
				
			}
			
			} if (toplam==sayı) {
				System.out.println("Mükemmel sayıdır. ");
				
				
				
			}else {
				
				
				System.out.println("Mükemmel sayı değildir. ");
				
			}
			
		
			
		
		
		
		
		
		
	}

}
