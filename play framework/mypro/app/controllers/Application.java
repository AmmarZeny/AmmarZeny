package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.* ;
import  models.* ;
import views.html.index;
public class Application extends Controller {
	  
	static Form<Task> taskForm = Form.form(Task.class);
	
	public static Result index() {
		  return redirect(routes.Application.Eqution());
		}
	  
	public static Result Eqution() {
		  return ok(
		    views.html.index.render(Task.all(), taskForm)
		  );
		}
	  
	public static Result solve() {
		  Form<Task> filledForm = taskForm.bindFromRequest();
		  if(filledForm.hasErrors()) {
		    return badRequest(
		      views.html.index.render(Task.all(), filledForm)
		    );
		  } else {
		 return ok(  Task.doit(filledForm.get().d1,filledForm.get().d2,filledForm.get().d3) ) ;
		   
		  }
		}
	  
	  
	  
	}