package com.example.module4intentex4kotlin_new.modul

import java.io.Serializable

class User(var id: Int, var name: String): Serializable {
    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'
    }
}