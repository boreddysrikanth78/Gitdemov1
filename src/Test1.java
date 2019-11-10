
public class Test1 {
	public static void main(String[] args) {
		 int n=6,ar,a;
			int ar1[]={3,5,67,3,22,66};
			for(int i=0;i<=ar1.length-2;i++)
			{
				for(int j=0;j<=ar1.length-1;j++)
				{
					if(ar1[j]>ar1[j+1])
					{
						int temp=ar1[j+1];
						ar1[j+1]=ar1[i];
						ar1[i]=temp;
					}
				}
			}
			for(int data:ar1)
			{
				System.out.println(data+"");
				System.out.println();
			}


	}

	}


}
