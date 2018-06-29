package com.ahan.eight;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.ahan.SqlHelper;
import com.ahan.bean.FilmInfoLocationBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class CityMange {
        private SqlHelper dbHelper;
        public CityMange(Context context){
            dbHelper=new SqlHelper(context);
        }
        public  void insertCity(List<FilmInfoLocationBean.PBean> pBean){
            String sql = "insert into city(id,cityId,n,count,pinyinFull,pinyinShort) values(null,?,?,?,?,?)";
            SQLiteDatabase db=dbHelper.getReadableDatabase();
            SQLiteStatement stat = db.compileStatement(sql);
            db.beginTransaction();

            for (FilmInfoLocationBean.PBean line : pBean) {
                stat.bindLong(1, line.getId());
                stat.bindString(2, line.getN());
                stat.bindLong(3, line.getCount());
                stat.bindString(4, line.getPinyinFull());
                stat.bindString(5, line.getPinyinShort());
                stat.executeInsert();
            }
            db.setTransactionSuccessful();
            db.endTransaction();
            db.close();
        }
//        public void delete(int student_Id){
//            SQLiteDatabase db=dbHelper.getWritableDatabase();
//            db.delete("","=?", new String[]{String.valueOf(student_Id)});
//            db.close();
//        }


    /**
     * 得到城市
     * @return
     */
        public List<FilmInfoLocationBean.PBean> getCityList(){
            SQLiteDatabase db=dbHelper.getReadableDatabase();
            String selectQuery="SELECT *  FROM  city";
            List<FilmInfoLocationBean.PBean> studentList=new ArrayList<>();
            Cursor cursor=db.rawQuery(selectQuery,null);

            if(cursor.moveToFirst()){
                do{
                    FilmInfoLocationBean.PBean  pBean= new FilmInfoLocationBean.PBean();
                   pBean.setId( cursor.getInt(cursor.getColumnIndex("cityId")));
                   pBean.setCount(cursor.getInt(cursor.getColumnIndex("count")));
                   pBean.setPinyinFull(cursor.getString(cursor.getColumnIndex("pinyinFull")));
                   pBean.setPinyinShort(cursor.getString(cursor.getColumnIndex("pinyinShort")));
                   pBean.setN(cursor.getString(cursor.getColumnIndex("n")));
                    studentList.add(pBean);
                }while(cursor.moveToNext());
            }
            cursor.close();
            db.close();
            return studentList;
        }
    /**
     *
     *根据id 查城市（未用到）
     * @param name
     * @return
     */
    public FilmInfoLocationBean.PBean getCityById(String name){
            SQLiteDatabase db=dbHelper.getReadableDatabase();
            String selectQuery="SELECT  *"+
                    " FROM  city"
                    + " WHERE  n"
                     + "=?";
            FilmInfoLocationBean.PBean  student=new FilmInfoLocationBean.PBean ();
            Cursor cursor=db.rawQuery(selectQuery,new String[]{String.valueOf(name)});
            if(cursor.moveToFirst()){
                do{
                    student.setId( cursor.getInt(cursor.getColumnIndex("id")));
                    student.setCount(cursor.getInt(cursor.getColumnIndex("count")));
                    student.setPinyinFull(cursor.getString(cursor.getColumnIndex("pinyinFull")));
                    student.setPinyinShort(cursor.getString(cursor.getColumnIndex("pinyinShort")));
                    student.setN(cursor.getString(cursor.getColumnIndex("n")));
                }while(cursor.moveToNext());
            }
            cursor.close();
            db.close();
            return student;
        }
    }

