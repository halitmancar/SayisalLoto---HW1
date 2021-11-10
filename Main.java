import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int kacKolon=9;  //kaç kolon oynatılacağı girilir.
		int[][] kagitKolon = new int[kacKolon][6];
		
		for(int i=0;i<kacKolon;i++) {
			for(int a=0;a<6;a++) {
				kagitKolon[i][a] = rand.nextInt(50);
				if (a==0) {
					while(kagitKolon[i][a]==0 ) {	//ilk değerin 0 olmasının önüne geçer.
						kagitKolon[i][a] = rand.nextInt(50);								
					}	
				}
				for(int x=0;x<a;x++) {
					while(kagitKolon[i][x] == kagitKolon[i][a] || kagitKolon[i][a]==0 ) {	//değerlerinin birbirine eşit olmasının ve 0 olmasının önüne geçer.
						kagitKolon[i][a] = rand.nextInt(50);								
					}
				}
			}
		}
		
		for(int i=0; i<kacKolon; i++) {
			
				System.out.print(i+1 + ". Kolon = ");	
			
			
			for(int x=0; x<6; x++) {
				System.out.print(kagitKolon[i][x] + " ");
				if (x==5) {
					System.out.println();
				}
			}
		}

	}

}
