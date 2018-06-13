/**
 * TODO:
 *
 * @Author ZYQ
 * @Date 2018-04-26 18:34
 **/
package spring.core.servlet;

import org.springframework.core.io.ClassPathResource;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO:
 *
 * @Version 1.0.0
 * @Package spring.servlet
 * @Author ZYQ
 * @Date 2018-04-26 18:34
 */
public class DispatcherServlet extends HttpServlet {


    /**
     * 配置参数加载进来
     */
    private Properties contextConfig = new Properties();


    /**
     * 保存配置文件加载后的信息
     */

    private ConcurrentHashMap<String, Object> beanDefinition = new ConcurrentHashMap<String, Object>();


    List beanDefintionNames = new ArrayList();


    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*super.doPost(req, resp);*/
        System.out.println("---------------------doPOST操作-----------------------");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //开始初始化操作

        //定位
        doLoadConfig(config.getInitParameter("contextConfigLocation"));


        //加载,加载配置文件中的信息

        doLoadDefinition();


        //注册
        doRegister();

        //自动依赖注入

        doAutowired();


        //如果这里是springMVC这是会多出来一个handlerMapping方法
        //将@RequestMapping中配置的url和一个Method关联上
        //以便于从浏览器获得用户输入的url以后，能够找到具体执行的Method通过反射去调用
        initHandlerMapping();

    }

    /**
     * 定位文件
     *
     * @param location
     */
    private void doLoadConfig(String location) {
        //在sping中是通过Reader来查找和定位的
        //在这里我们用properties来直接读取
        InputStream is = null;

        //ResourceUtils
        try {
            if (location.toLowerCase().contains("classpath:")) {
                ClassLoader loader= getClass().getClassLoader();

                is=loader.getResourceAsStream(location.substring(10));


            }
            contextConfig.load(is);
            System.out.println("nihao");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void doLoadDefinition() {

    }

    private void doRegister() {
    }


    private void initHandlerMapping() {
    }

    private void doAutowired() {
    }

}
