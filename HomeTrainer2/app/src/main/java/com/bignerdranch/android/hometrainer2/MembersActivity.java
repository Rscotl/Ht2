package com.bignerdranch.android.hometrainer2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MembersActivity extends AppCompatActivity {
private List<RegistryActivity>mList;
private Context mContext;
private SQLiteDatabase mDatabase;
private MembersActivity(Context context) {
    mContext = context.getApplicationContext();
    mDatabase = new MemberHelper(mContext)
            .getWritableDatabase();

}
public void addMember(Member m){

}
public List<Member> getMember(){
    return new ArrayList<>();
}
public Member getMember(UUID id){
    return null;
}
private static ContentValues getContentValues(Member member){
    ContentValues values = new ContentValues();
    values.put(MemberDbsSchema.MemberTable.UUID, member.getName().toString());
    values.put(MemberDbsSchema.MemberTable.Address, member.getName().toString());
    values.put(MemberDbsSchema.MemberTable.Email, member.getName().toString());
    values.put(MemberDbsSchema.MemberTable.PhoneNumber, member.getName().toString());
    return values;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        ListView mylist =(ListView)findViewById(R.id.mylist);
        final ArrayList<String>members = new ArrayList<String>();
        final ArrayAdapter<String> aa;
         aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,members);
        mylist.setAdapter(aa);


    }
}
