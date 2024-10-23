package level_2;
public class pyramid {
	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=2*num;j++) {
				if(i+j>=num-1||j+i>num||i==j) {
			System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

			
		
	


