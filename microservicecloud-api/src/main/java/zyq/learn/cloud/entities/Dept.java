package zyq.learn.cloud.entities;

import java.io.Serializable;

public class Dept implements Serializable {//Dept(Entity)  orm mysql->Dept(table)    类表关系映射
    private Long deptno;   //主键
    private String dname;  //部门名称
    private String db_source; // 数据存进哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }

    public Dept(Long deptno, String dname, String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Dept(){
    }



}
