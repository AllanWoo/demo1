package com.example.demo.entity;

import com.alibaba.fastjson2.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
@Controller
public class Test{


    @RequestMapping("/index")
    public String index() {
        return "redirect:index.html";
    }




    /**
     *只需要更改doGet方法
     */
    @RequestMapping("/QueryAll")
    public void QueryAll(HttpServletResponse response) throws ServletException, IOException{


            System.out.println("进来了");
            ArrayList<Student> rows = Db.i.all();

            //转换成JSON格式
            JSONArray result = new JSONArray(rows);


            //返回数据
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/plain");
            Writer writer = response.getWriter();
            writer.write(result.toString());
            writer.close();
    }

}
