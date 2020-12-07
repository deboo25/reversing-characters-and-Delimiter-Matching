
package javaapplication31;


public class back {
    private String input;
    public back(String x){
    input=x;}
    
    public void check(){
        int a=input.length();
        Stack sk=new Stack(a);
        for(int i=0;i<a;i++){
            char ch=input.charAt(i);
            switch(ch){
                case'(':
                case'[':
                case'{':
                    sk.push(ch);
                    break;
                    
                    case')':
                    case'}':
                    case']':
                        if(!sk.IsEmpty()){
                        char chx=(char) sk.pop();
                        if( (ch==')'&&chx!='(')||(ch==']'&&chx!='[')||(ch=='}'&&chx!='{'))
                            System.out.println("error "+ch);
                        }
                        else
                           System.out.println("error "+ch);
                        break;
                    default:
                        break;
                        
                        
                    
                
                
                
            }
                    
        }
        
        
        
        if(!input.isEmpty())
             System.out.println("error ");
        
        
        
    }
    
    
}
