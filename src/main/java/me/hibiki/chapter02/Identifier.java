package me.hibiki.chapter02;

public class Identifier {
    private String birthday;
    //不符合驼峰命名法
    //private  String User_name;
    //不能以_和$开头
    //private Integer _systme_vari;
    //不能以_和$开头
    //private Integer $max;
    //不能以数字开头
    //private Integer 3max;
    //不能包含#
    //private  Integer room#;
    //不能使用关键字
    //private  Integer class;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
