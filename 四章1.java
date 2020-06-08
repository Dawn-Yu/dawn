package even;

import java.util.Scanner;

public class 四章1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		float a,b,c;
		Scanner f=new Scanner(System.in);
		System.out.println("输入a,b,c:");
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
