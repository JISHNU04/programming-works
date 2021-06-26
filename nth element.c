#include <stdio.h>
void main()
{
	int a[20],n,i,k=3,c;
	printf("enter the array length\n");
	scanf("%d",&n);
	printf("enter the array\n");
	for (int i = 0; i < n; i++)
	scanf("%d",&a[i]);
	printf("the Nth smallest element is\n");
	c=1
	for (int i = 1; i < n; ++i)
	{
		if (c==k)
		{
			/* code */
			printf("%d\n",a[i-1] );
		}
		if(a[i]!=a[i-1])
			c++;
	}
	scanf("%d",&i);
}