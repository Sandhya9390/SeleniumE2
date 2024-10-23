package level_2;
public class demo1 {
	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<2*num;j++)
			{
				if(i+j>num&&j-i<num)
				{
					if(i%2!=0)
					{
						System.out.print(1+" ");
					}
					else {
						System.out.print(0+" ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
			

				
					
						

			
		
				
	
