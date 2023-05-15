package com.example.module4intentex4kotlin_new.modul

import java.io.Serializable

class Member(var age: Int, var name: String): Serializable {
    override fun toString(): String {
        return "Member{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'
    }
}