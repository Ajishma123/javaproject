package package1;

public class pgm40 {

	public static void trin (int n) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<n; i++)
		{
			for (int j=n-i; j>1; j--)
			{
				System.out.print("  ");
				
			}
	for (int j=0; j<i; j++) {
		System.out.print("* ");
	}
			System.out.println();
		}
		}
		public static void main (String []args) {
			
		int n=5;
		trin(n);
	}
	
}

