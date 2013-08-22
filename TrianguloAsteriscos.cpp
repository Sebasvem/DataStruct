#include <iostream.h>
 
 using namespace std;
 
 int main(){
     cout<<"**************************** Triangulo De Asteriscos ***************************"<<endl;
    int x;
    bool flag=true;
    char a;
    do{
    cout<<"Type a Number: ";
    cin>>x; 
    cout<<endl;
    for(int i=0; i<x; i++)          
    {
     if(i<x)                      
     {
      for(int j=1; j<x-i; j++)
      {
       cout<<" ";                   
      }
      for(int j=0; j<i+1; j++)         
      {
       cout<<"* ";
      }
      cout<<endl;
     }
     }
     cout<<endl;
               
         cout<<"Desea hacerlo otraves s/n: ";
         cin>>a;   
         if(a=='s'){
              flag=true;    
                  }else{
                        flag=false;
                        }
                        cout<<endl;
            
       }while(flag);
     
     return system("pause");
     }
