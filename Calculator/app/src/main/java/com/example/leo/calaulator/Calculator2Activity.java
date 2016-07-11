package com.example.leo.calaulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Stack;

public class Calculator2Activity extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<Menu>();
    private EditText equation;
    private EditText result;
    private Button left_parenthesis;
    private Button right_patenthesis;
    private Button pi;
    private Button chengdfang;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button factorial;
    private Button fenzhiyi;
    private Button log;
    private Button pingfang;
    private Button e_mul;
    private Button add;
    private Button min;
    private Button mul;
    private Button miv;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button back;
    private Button four;
    private Button five;
    private Button six;
    private Button clear;
    private Button one;
    private Button two;
    private Button three;
    private Button point;
    private Button o;
    private Button equal;
    private Button sign;
    private String str = "";
    public String m = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_calculator2);

        initMenu();
        MenuAdapter adapter = new MenuAdapter(Calculator2Activity.this,R.layout.menu_item,menuList);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                String s = menuList.get(position).getName();
                if (s.equals("多项式计算器")){
                    Intent intent = new Intent(Calculator2Activity.this,Calculator2Activity.class);
                    startActivity(intent);
                }

                else if (s.equals("简易计算器")){
                    Intent intent = new Intent(Calculator2Activity.this,CaculatorActivity.class);
                    startActivity(intent);
                }
            }
        });

        equation = (EditText) findViewById(R.id.editText3);
        result = (EditText) findViewById(R.id.editText2);
        left_parenthesis = (Button) findViewById(R.id.button12);
        right_patenthesis = (Button) findViewById(R.id.button);
        pi = (Button) findViewById(R.id.button11);
        chengdfang = (Button) findViewById(R.id.button10);
        sin = (Button) findViewById(R.id.button14);
        cos = (Button) findViewById(R.id.button16);
        tan = (Button) findViewById(R.id.button15);
        factorial = (Button) findViewById(R.id.button13);
        fenzhiyi = (Button) findViewById(R.id.button40);
        log = (Button) findViewById(R.id.button38);
        pingfang = (Button) findViewById(R.id.button39);
        e_mul = (Button) findViewById(R.id.button37);
        add = (Button) findViewById(R.id.button17);
        min = (Button) findViewById(R.id.button21);
        mul = (Button) findViewById(R.id.button20);
        miv = (Button) findViewById(R.id.button19);
        seven = (Button) findViewById(R.id.button23);
        eight = (Button) findViewById(R.id.button25);
        nine = (Button) findViewById(R.id.button24);
        back = (Button) findViewById(R.id.button22);
        four = (Button) findViewById(R.id.button27);
        five = (Button) findViewById(R.id.button29);
        six = (Button) findViewById(R.id.button28);
        clear = (Button) findViewById(R.id.button26);
        one = (Button) findViewById(R.id.button33);
        two = (Button) findViewById(R.id.button32);
        three = (Button) findViewById(R.id.button31);
        point = (Button) findViewById(R.id.button30);
        o = (Button) findViewById(R.id.button34);
        equal = (Button) findViewById(R.id.button35);
        sign = (Button) findViewById(R.id.button_sign);

        left_parenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "(";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        right_patenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = ")";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "π";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        chengdfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "^";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "sin";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);

            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "cos";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);

            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "tan";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);

            }
        });

        //阶乘
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "!";
                str = str + a;
                equation.setText(str);
                num(a);
                if (!numstack.empty()){
                    double num_d = Double.parseDouble(numstack.pop());
                    double j = 1;
                    if (!numstack.pop().contains(".") && num_d > 0){
                        do {
                            j *= num_d;
                            num_d --;
                        }while (num_d > 0);
                    }
                    String str_d = Double.toString(j);
                    numstack.push(str_d);
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "log";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        //平方
        pingfang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "^2";
                str = str + a;
                equation.setText(str);
                num(a);
                if (!numstack.empty()){
                    double num_d = Double.parseDouble(numstack.pop());
                    num_d = num_d * num_d;
                    String str_d = Double.toString(num_d);
                    numstack.push(str_d);
                }
            }
        });

        e_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "e^";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = " + ";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = " - ";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        miv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = " / ";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = " * ";
                str = str + a;
                equation.setText(str);
                num(a);
                op(a);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "7";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "8";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "9";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "4";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "5";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "6";
                str += "6";
                equation.setText(str);
                num(a);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "1";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "2";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "3";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = ".";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "0";
                str = str + a;
                equation.setText(str);
                num(a);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String a = "=";
                    str = str + a;
                    equation.setText(str);
                    num(a);
                    result.setText(getresult());
                }catch (Exception e)
                {
                    result.setText("error");
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.length() != 0){
                    String r = str.substring(str.length()-1,str.length());
                    //str = r;

                    if (r.equals(" ")){
                        str = str.substring(0,str.length()-3);
                        equation.setText(str);
                    }else{
                        if (r.equals(".")||r.equals("0")||r.equals("1")||r.equals("2")||r.equals("3")||r.equals("4")||r.equals("5")||r.equals("6")||r.equals("7")||r.equals("8")||r.equals("9")){
                            m = m.substring(0,str.length()-1);
                            str = str.substring(0,str.length()-1);
                            equation.setText(str);
                        }
                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                equation.setText(null);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "-";
                str = str + a;
                equation.setText(str);
            }
        });
    }

    Stack<String> numstack = new Stack<>();
    Stack<String> opstack = new Stack<>();

    //比较优先级priority
    public boolean priority(char a,char b){
        int x = 0;
        int y = 0;

        switch (a){
            case'(':x = 0;
                break;
            case '+':x = 1;
                break;
            case '-':x = 1;
                break;
            case '*':x = 2;
                break;
            case '/':x = 2;
                break;
            case 's':x = 4;
                break;
            case 'c':x = 4;
                break;
            case 't':x = 4;
                break;
            case 'n':x = 4;
                break;
            case 'l':x = 4;
                break;
            case '^':x = 3;
                break;
            case 'e':x = 4;
                break;
            case ')':x = 5;
        }

        switch (b){
            case'(':y = 0;
                break;
            case '+':y = 1;
                break;
            case '-':y = 1;
                break;
            case '*':y = 2;
                break;
            case '/':y = 2;
                break;
            case 's':y = 4;
                break;
            case 'c':y = 4;
                break;
            case 't':y = 4;
                break;
            case 'n':y = 4;
                break;
            case 'l':y = 4;
                break;
            case '^':y = 3;
                break;
            case 'e':y = 4;
                break;
            case ')':y = 5;
        }
        return (x >= y);
    }

    //将字符串转换成操作数并入栈
    public void num(String n){

        //m += n;
        //String r = str.substring(str.length()-1,str.length());
        if (n.equals(".")||n.equals("0")||n.equals("1")||n.equals("2")||n.equals("3")||n.equals("4")||n.equals("5")||n.equals("6")||n.equals("7")||n.equals("8")||n.equals("9")){
            m += n;
        }
        else if (n.equals(")")){
            //double s = Double.parseDouble(m);

        }
        else{
            numstack.push(m);
            m="";
        }
        //double s = Double.parseDouble(m);
    }

    //操作符入栈函数
      public void op(String p){
          if(opstack.empty()){
              opstack.push(p);
          }
          else{
              String s1 = opstack.peek().substring(0,1);
              String s2 = p.substring(0,1);

              if (s1.equals(" ")){
                  s1 = opstack.peek().substring(1,2);
              }

              if (s2.equals(" ")){
                  s2 = p.substring(1,2);
              }
              char op1 = s1.charAt(0);
              char op2 = s2.charAt(0);
              //比较运算符的优先级，如果当前运算符优先高于等于栈顶运算符的优先级，则入栈
              if(priority(op2,op1)||s2.equals("(")){
                  opstack.push(p);
              }
              else{                          //如果低于，则进行运算
                  /*do {

                  }while ()*/


                  if (opstack.peek().equals(")")){
                      opstack.pop();
                  }

                  if (opstack.peek().equals("(")){
                      opstack.pop();
                  }

                  if (opstack.peek().equals("sin")){
                      if (!numstack.empty()){
                          double num_d = Double.parseDouble(numstack.pop());
                          num_d = Math.sin(num_d);
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }
                  }

                  if (opstack.firstElement().equals("cos")){
                      if (!numstack.empty()){
                          double num_d = Double.parseDouble(numstack.pop());
                          num_d = Math.cos(num_d);
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }
                  }

                  if (opstack.peek().equals("tan")){
                      if (!numstack.empty()){
                          double num_d = Double.parseDouble(numstack.pop());
                          num_d = Math.tan(num_d);
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }
                  }

                  if (opstack.peek().equals("log")){
                      if (!numstack.empty()){
                          double num_d = Double.parseDouble(numstack.pop());
                          if (num_d > 0){
                              num_d = Math.log10(num_d);
                          }
                          else {
                              Toast.makeText(Calculator2Activity.this, "输入错误,真数应大于零", Toast.LENGTH_SHORT).show();
                          }
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }
                  }

                  if (opstack.peek().equals("e^")){
                      if (!numstack.empty()){
                          double num_d = Double.parseDouble(numstack.pop());
                          num_d = Math.exp(num_d);
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }
                  }

                  if (opstack.peek().equals("^")){
                      if (!numstack.empty()){
                          double num_d1 = Double.parseDouble(numstack.pop());
                          double num_d2 = Double.parseDouble(numstack.pop());
                          double num_d = Math.pow(num_d1,num_d2);
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }

                   }

                  if (opstack.peek().equals("+")){
                      if (!numstack.empty()){
                          double num_d1 = Double.parseDouble(numstack.pop());
                          double num_d2 = Double.parseDouble(numstack.pop());
                          double num_d = num_d1 + num_d2;
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);

                      }
                  }

                  if (opstack.peek().equals("-")){
                      if (!numstack.empty()){
                          double num_d1 = Double.parseDouble(numstack.pop());
                          double num_d2 = Double.parseDouble(numstack.pop());
                          double num_d = num_d1 - num_d2;
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }

                  }

                  if (opstack.peek().equals("*")){
                      if (!numstack.empty()){
                          double num_d1 = Double.parseDouble(numstack.pop());
                          double num_d2 = Double.parseDouble(numstack.pop());
                          double num_d = num_d1 * num_d2;
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }

                  }

                  if (opstack.peek().equals("/")){
                      if (!numstack.empty()){
                          double num_d1 = Double.parseDouble(numstack.pop());
                          double num_d2 = Double.parseDouble(numstack.pop());
                          double num_d = num_d1 / num_d2;
                          String str_d = Double.toString(num_d);
                          numstack.push(str_d);
                      }

                  }

              }
          }
      }


    //计算结果
    public String getresult(){

            do {
                if (opstack.peek().equals(")")){
                    opstack.pop();
                }

                else if (opstack.peek().equals("(")){
                    opstack.pop();
                }

                else if (opstack.peek().equals("sin")){
                    if (!numstack.empty()){
                        double num_d = Double.parseDouble(numstack.pop());
                        num_d = Math.sin(num_d);
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }
                }

                else if (opstack.peek().equals("cos")){
                    if (!numstack.empty()){
                        double num_d = Double.parseDouble(numstack.pop());
                        num_d = Math.cos(num_d);
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }
                }

                else if (opstack.peek().equals("tan")) {
                    if (!numstack.empty()) {
                        double num_d = Double.parseDouble(numstack.pop());
                        num_d = Math.tan(num_d);
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }
                }

                    else    if (opstack.peek().equals("log")){
                    if (!numstack.empty()){
                        double num_d = Double.parseDouble(numstack.pop());
                        if (num_d > 0){
                            num_d = Math.log10(num_d);
                        }
                        else {
                            Toast.makeText(Calculator2Activity.this, "输入错误,真数应大于零", Toast.LENGTH_SHORT).show();
                        }
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }
                }

                    else if (opstack.peek().equals("e^")){
                    if (!numstack.empty()){
                        double num_d = Double.parseDouble(numstack.pop());
                        num_d = Math.exp(num_d);
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }
                }

                    else if (opstack.peek().equals("^")){
                    if (!numstack.empty()){
                        double num_d1 = Double.parseDouble(numstack.pop());
                        double num_d2 = Double.parseDouble(numstack.pop());
                        double num_d = Math.pow(num_d1,num_d2);
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }

                }

                    else if (opstack.peek().equals(" + ")){
                    if (!numstack.empty()){
                        double num_d1 = Double.parseDouble(numstack.pop());
                        double num_d2 = Double.parseDouble(numstack.pop());
                        double num_d = num_d1 + num_d2;
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                        //Toast.makeText();
                    }

                }

                    else if (opstack.peek().equals(" - ")){
                    if (!numstack.empty()){
                        double num_d1 = Double.parseDouble(numstack.pop());
                        double num_d2 = Double.parseDouble(numstack.pop());
                        double num_d = num_d2 - num_d1;
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();

                    }

                }

                else if (opstack.peek().equals(" * ")){
                    if (!numstack.empty()){
                        double num_d1 = Double.parseDouble(numstack.pop());
                        double num_d2 = Double.parseDouble(numstack.pop());
                        double num_d = num_d1 * num_d2;
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }

                }

                else if (opstack.peek().equals(" / ")){
                    if (!numstack.empty()){
                        double num_d1 = Double.parseDouble(numstack.pop());
                        double num_d2 = Double.parseDouble(numstack.pop());
                        double num_d = num_d2 / num_d1;
                        String str_d = Double.toString(num_d);
                        numstack.push(str_d);
                        opstack.pop();
                    }

                }
            }while (!opstack.empty());

        return numstack.pop();
    }



    private void initMenu(){
        Menu item_1 = new Menu("简易计算器",R.mipmap.jianyi);
        menuList.add(item_1);
        Menu item_2 = new Menu("多项式计算器",R.mipmap.duoxiangshi);
        menuList.add(item_2);
    }




}


