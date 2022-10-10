#include <iostream>  
using namespace std;  
int main(){
	int num,rev,rem;
	cout<<"Enter any number"<<endl;
	cin>>num;
	while(num>0){
		 rem=num%10;//reverse number
		rev=(rev*10)+rem;
		num=num/10;
		
		//reverse number
	}
cout<<rev<<endl;	
}
