package com.example.leo.calaulator;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
//import com.example.leo.calaulator.Menu.java;


public class CaculatorActivity extends AppCompatActivity {
    private Button bt0;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt_add;
    private Button bt_point;
    private Button bt_min;
    private Button bt_mul;
    private Button bt0_div;
    private Button bt_back;
    private Button bt_clear;
    private Button bt_equ;
    private EditText et;
    boolean flag = false;
    boolean point_flag = true;

    private List<Menu> menuList = new ArrayList<Menu>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);


        initMenu();
        MenuAdapter adapter = new MenuAdapter(CaculatorActivity.this,R.layout.menu_item,menuList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //if (position)
                String s = menuList.get(position).getName();
                if (s.equals("多项式计算器")){
                    Intent intent = new Intent(CaculatorActivity.this,Calculator2Activity.class);
                    startActivity(intent);
                }
                else if (s.equals("简易计算器")){
                    Intent intent = new Intent(CaculatorActivity.this,CaculatorActivity.class);
                    startActivity(intent);
                }

            }
        });



        bt0 = (Button) findViewById(R.id.button0);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6 = (Button) findViewById(R.id.button6);
        bt7 = (Button) findViewById(R.id.button7);
        bt8 = (Button) findViewById(R.id.button8);
        bt9 = (Button) findViewById(R.id.button9);
        bt_add = (Button) findViewById(R.id.button_add);
        bt_min = (Button) findViewById(R.id.button_min);
        bt_mul = (Button) findViewById(R.id.button_mul);
        bt_point = (Button) findViewById(R.id.button_point);
        bt_equ = (Button) findViewById(R.id.button_equ);
        bt0_div = (Button) findViewById(R.id.button_div);
        bt_back = (Button) findViewById(R.id.button_back);
        bt_clear = (Button) findViewById(R.id.button_clear);
        et = (EditText) findViewById(R.id.editText);




        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if (et.getText().equals("")){
                    Toast.makeText(CaculatorActivity.this, "输入错误", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(flag){
                        et.setText("");
                        et.setText(((Button)v).getText());
                        point_flag = true;
                    }
                    else
                        et.setText(str+((Button)v).getText());
                }

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(flag){
                    et.setText("");
                    et.setText(((Button)v).getText());
                    flag = false;
                    point_flag = true;
                }
                else
                    et.setText(str+((Button)v).getText());
            }
        });

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str.contains(" ")){
                    getResult();
                    flag = false;
                    point_flag = true;
                    et.setText(et.getText()+" "+((Button)v).getText()+" ");

                }else{
                    et.setText(str+" "+((Button)v).getText()+" ");
                    flag = false;
                    point_flag = true;
                }

            }
        });

        bt_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str.contains(" ")){
                    getResult();
                    flag = false;
                    point_flag = true;
                    et.setText(et.getText()+" "+((Button)v).getText()+" ");

                }else{
                    et.setText(str+" "+((Button)v).getText()+" ");
                    flag = false;
                    point_flag = true;
                }

            }
        });

        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str.contains(" ")){
                    getResult();
                    flag = false;
                    point_flag = true;
                    et.setText(et.getText()+" "+((Button)v).getText()+" ");

                }else{
                    et.setText(str+" "+((Button)v).getText()+" ");
                    flag = false;
                    point_flag = true;
                }

            }
        });

        bt0_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str.contains(" ")){
                    getResult();
                    flag = false;
                    point_flag = true;
                    et.setText(et.getText()+" "+((Button)v).getText()+" ");

                }else{
                    et.setText(str+" "+((Button)v).getText()+" ");
                    flag = false;
                    point_flag = true;
                }

            }
        });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                if(str!= null && str.length() != 0 ){
                    String r = str.substring(str.length()-1,str.length());
                    if (r.equals(" ")){
                        str = str.substring(0,str.length()-3);
                        et.setText(str);
                    }else{
                        str = str.substring(0,str.length()-1);
                        et.setText(str);
                    }

                }
            }
        });

        bt_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(null);
                point_flag = true;
            }
        });

        bt_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
                //flag = false;
                point_flag = true;
                if (!getResult()){
                    Toast.makeText(CaculatorActivity.this, "输入错误", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = et.getText().toString();
                if (point_flag&&!str.equals("")){
                    et.setText(str+((Button)v).getText());
                    point_flag = false;
                }
                else {
                    Toast.makeText(CaculatorActivity.this, "输入错误", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private void initMenu(){
        Menu item_1 = new Menu("简易计算器",R.mipmap.jianyi);
        menuList.add(item_1);
        Menu item_2 = new Menu("多项式计算器",R.mipmap.duoxiangshi);
        menuList.add(item_2);
    }

    private boolean getResult(){
        point_flag = false;
        String exp = et.getText().toString();
        /*if(exp.equals("")){
            return;
        }*/
        if (exp.contains("  ")){
            //Toast.makeText(CaculatorActivity.this, "输入错误", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!exp.contains(" ")){

            return true;
        }

        String s1 = exp.substring(0,exp.indexOf(" "));
        String op = exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2);
        String s2 = exp.substring(exp.indexOf(" ")+3);
        double result = 0;

        if (!s1.equals("")&&!s2.equals("")){
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")){
                result = d1 + d2;
            }else if (op.equals("-")) {
                result = d1 - d2;
            }else if (op.equals("*")){
                result = d1 * d2;
            }else if (op.equals("/")){
                if (d2 == 0){
                    //et.setText("错误");
                    return false;
                }else{
                    result = d1 / d2;
                }
            }
        }else if (!s1.equals("")&&s2.equals("")){
            return true;
        }else if (s1.equals("")&&!s2.equals("")){
            return false;
        }

        if (!s1.contains(".")&&!s2.contains(".")&&!op.equals("/")){
            int r = (int)result;
            et.setText(r+"");
            flag = true;
        }

        else {
            et.setText(result+"");
            flag = true;
        }
    return true;
    }
}


