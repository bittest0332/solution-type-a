package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int Ncount = 0;
		int number1 = 0;
		int number2 = 0;
		for(;;) {
			if(number>=10) {
				number2 = number / 10;
				number1 = number2*10-number;
				Ncount++;
			}
			else {
				break;
			}
		}

		for(int i = 0; i < Ncount; i++) {
			if(number1==3 || number1==6 || number1==9) {
				return 1;
			}
			else if(number2==3 || number2==6 || number2==9) {
				return 1;
			}
		}
		return 0;
	}
}