package com.ahan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SqlHelper extends SQLiteOpenHelper {


    //每次你对数据表进行编辑，添加时候，你都需要对数据库的版本进行提升

    //数据库版本
    private static final int DATABASE_VERSION=1;

    //数据库名称
    private static final String DATABASE_NAME="sqlitestudy.db";


    public SqlHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建数据表
        String city_sql="CREATE TABLE  city"+
        "(id INTEGER PRIMARY KEY AUTOINCREMENT ,cityId INTEGER, n TEXT,  count INTEGER, pinyinFull TEXT,pinyinShort TEXT)";
        db.execSQL(city_sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //如果旧表存在，删除，所以数据将会消失
        //再次创建表
        onCreate(db);
    }
}

