//5.	Write a program to accept n numbers and store in an array. Perform following operation on array using switch case. (Use Function for each operation) 
//a.Print Array elements 
//b.Calculate Average of Array elements 
//c.Find Max of Array 
//d.Search an element in Array 
//e.Count Occurrence of an element in Array 



import java.util.Scanner;
public class ArraySwitchCase{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	while(true){
	System.out.println("""
		\n1.Display  
		2.Avg 
		3.Max  
		4.Search 
		5.Frequancy 
		6.EXIT  
		Enter a Choice """);
	int ch=sc.nextInt();
	switch(ch){
	case 1->display(a,n);
	case 2->System.out.println("average is : "+(sum(a,n)/n));
	case 3->max(a,n);
	case 4->{
		System.out.println("Enter element you want to search:");
		int ele=sc.nextInt();
		if(search(a,n,ele))
			System.out.println("Element found");
		else
			System.out.println("not found");
		}
	
	case 5->{
		System.out.println("enter element you want to count frequency : ");
		int ele=sc.nextInt();
		frequnecy(a,n,ele);
		}
	case 6->System.exit(0);
	default->System.out.println("Invalid choice");
	}
	}
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void display(int a[],int n){
		System.out.println("\narray elements are:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

	public static void max(int a[],int n){
		int max=a[0];
		for(int i=0;i<n;i++){
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Max no is : "+max);
	}
	
	public static boolean search(int a[],int n,int ele){
		for(int i=0;i<n;i++){
			if(ele==a[i])
				return true;
		}
		return false;
	}

	public static int sum(int a[],int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		return sum;
	}

	public static void frequnecy(int a[],int n,int ele){
		int cnt=0;
		for(int i=0;i<n;i++){
			if(ele==a[i])
				cnt++;
		}
		System.out.println("frequency count :"+cnt);
	}
}





