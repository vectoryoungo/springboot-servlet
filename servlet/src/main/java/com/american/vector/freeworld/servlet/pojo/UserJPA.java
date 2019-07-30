/**
 * @create 2019-07-30 16:37
 * @desc
 **/
package com.american.vector.freeworld.servlet.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbb_user")
public class UserJPA implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String name;
    private int age;
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

