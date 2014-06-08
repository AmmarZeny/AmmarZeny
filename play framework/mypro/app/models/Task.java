package models;

import java.util.*;

import play.data.validation.Constraints.*;
import play.mvc.Result;

public class Task {
    
	
	  @Required
	  public int d1;
	  @Required
	  public int d2;
	  @Required
	  public int d3;
	  
  public static List<Task> all() {
    return new ArrayList<Task>();
  }
  
  public static String doit(int a,int b,int c) {
	 
	  int x1=0,x2=0,delta=0 ;
	  int deltasqrt=0 ;
	  delta=(b*b)-(4*a*c) ;
	  
	  if (delta<0)
		  return "Can't find any Solution or Square root because Delta is < 0.0  .... " ;
	  else {
		  if (delta==0)
		  {   x1=x2=-b/(2*a);
			  return " The Solution is Single delta = 0 .........  [ X1 = X2 = "+x1+" ]";
					  }
			  else
			  {
				 deltasqrt =(int) Math.sqrt(delta);
				  x1=(-b-deltasqrt)/(2*a);
	              x2=(-b+deltasqrt)/(2*a);
	  return " The Solution is ......  [ X1="+x1+"    , X2="+x2+" ]"   ;
			  }
			  
			  }
  }
  
 
}
    
