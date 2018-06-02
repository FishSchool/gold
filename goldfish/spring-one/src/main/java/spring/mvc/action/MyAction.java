package spring.mvc.action;


import spring.core.annotation.MyAutowired;
import spring.core.annotation.MyController;
import spring.core.annotation.MyRequestMapping;
import spring.service.IDemoService;

@MyController
public class MyAction {

		@MyAutowired

		IDemoService demoService;
		@MyRequestMapping("/index.html")
		public void query(){

		}
	
}
