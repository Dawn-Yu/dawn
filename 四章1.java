package even;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		float a,b,c;
		Scanner f=new Scanner(System.in);
		System.out.println("����a,b,c:");
		a=f.nextFloat();
		b=f.nextFloat();
		c=f.nextFloat();
		if(a>b&&a>c)
		{
			if(b>c) 
				{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				}
			else
				{
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
				}
			
		}
		else 
		{
			if(b>c)
			{
				if(a>c)
				{
					System.out.println(b);
					System.out.println(a);
					System.out.println(c);
				}
				else
				{
					System.out.println(b);
					System.out.println(c);
					System.out.println(a);
				}
			}
			else
			{
				if(a>b)
				{
					System.out.println(c);
					System.out.println(a);
					System.out.println(b);
				}
				else
				{
					System.out.println(c);
					System.out.println(b);
					System.out.println(a);
				}
			}
		}

		f.close();
	}

}
