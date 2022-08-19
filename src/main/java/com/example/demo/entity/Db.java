package com.example.demo.entity;

import java.util.ArrayList;

public class Db {

    //创建一个本类的全局对象
    public static Db i = new Db();

    //使用链表写入数据
    private ArrayList<Student> stu = new ArrayList<>();

    private Db()
    {
        stu.add(new Student(20180001,"老王","北京"));
        stu.add(new Student(20180002,"老甄","邢台"));
        stu.add(new Student(20180003,"老高","邢台"));
        stu.add(new Student(20180004,"老孟","邯郸"));
        stu.add(new Student(20180005,"老裴","太原"));
        stu.add(new Student(20180006,"老李","东北"));
        stu.add(new Student(20180007,"老张","武汉"));
        stu.add(new Student(20180008,"老苗","重庆"));
        stu.add(new Student(20180009,"老郭","北京"));

    }

    //获取全部信息
    public ArrayList<Student> all()
    {
        return stu;
    }

    //按照学号查询
    public ArrayList<Student> byId(int from,int to)
    {
        ArrayList<Student> qStu = new ArrayList<>();
        for(int i=0;i<stu.size();i++)
        {
            Student s = stu.get(i);
            if(s.id<=from &&s.id<=to)
            {
                qStu.add(s);
            }
        }
        return qStu;
    }

}
