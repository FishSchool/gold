package spring.mvc.action;

import spring.core.annotation.MyAutowired;
import spring.core.annotation.MyController;
import spring.core.annotation.MyRequestMapping;
import spring.core.annotation.MyRequestParam;
import spring.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MyController
@MyRequestMapping("/demo")
public class DemoAction {
	
	@MyAutowired
    private IDemoService demoService;
	
	@MyRequestMapping("/query.json")
	public void query(HttpServletRequest req, HttpServletResponse resp,
                      @MyRequestParam("name") String name){
		String result = demoService.get(name);
		System.out.println(result);
//		try {
//			resp.getWriter().write(result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	@MyRequestMapping("/edit.json")
	public void edit(HttpServletRequest req, HttpServletResponse resp, Integer id){

	}
	
}
