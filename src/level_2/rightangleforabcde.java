package level_2;
public class rightangleforabcde {
public static void main(String[] args) {
	int num=3;
	for(int i=2*num-1;i>=1;i--) {
		char ch='E';
		for(int j=2*num-1;j>=1;j--) {
			if(i+j<=2*num) {
				System.out.print(ch-- +" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
		

	

	


