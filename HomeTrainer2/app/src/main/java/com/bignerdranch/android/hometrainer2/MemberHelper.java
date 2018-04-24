package com.bignerdranch.android.hometrainer2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.hometrainer2.MemberDbsSchema.MemberTable;

/**
 * Created by ricky on 4/18/2018.
 */

public class MemberHelper extends SQLiteOpenHelper {
    public static final int Version = 1;
    public static final String DATABASE_NAME = "MemberBase.db";
    public MemberHelper(Context context){
        super(context,DATABASE_NAME,null,Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

db.execSQL("create Table "  + MemberTable.Name + "( "
       + "_id integer primary key autoincrement," +
        MemberTable.UUID + ","
      + MemberTable.Password +  ","
+ MemberTable.Email +  "," +
     MemberTable.Address +  ","
       + MemberTable.PhoneNumber);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){

    }
}
