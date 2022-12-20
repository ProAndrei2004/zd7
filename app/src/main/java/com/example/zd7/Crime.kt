package com.example.zd7

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime (@PrimaryKey val id:UUID = UUID.randomUUID())
{
    var title:String = ""
    var date:Int = 0
    var bool:Boolean = false;

}