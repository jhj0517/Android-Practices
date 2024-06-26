package com.jhj0517.room.localdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.jhj0517.room.models.ExampleData


@Database(entities = [ExampleData::class], exportSchema = false, version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dataDao(): DataDao?

    companion object{
        fun buildDB(context: Context): AppDatabase {
            return databaseBuilder(
                context,
                AppDatabase::class.java,
                "example-db"
            ).build()
        }
    }
}