package com.example.application1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void first(View v){
        String word;
        int p=0;
        EditText et = findViewById(R.id.et);
        TextView displayTV = findViewById(R.id.displayTV);
        String name = et.getText().toString();
        char[] array=new  char[name.length()];
        String name1=name.toLowerCase();
        if(name1.startsWith("a")|| name1.startsWith("e")||name1.startsWith("i")||name1.startsWith("o")||name1.startsWith("u")){

            if(Character.isUpperCase(name.charAt(0))){
                word=name.substring(0,1).toUpperCase().concat(name.substring(1)).concat("way");
                displayTV.setText("Pig Latin: "+word);
            }else{
                word=name.substring(0).concat("way");
                displayTV.setText("Pig Latin: "+word);
            }
        }
        else{
            for( int i=0;i<name1.length();i++){
                array[i]=name1.charAt(i);
                if(array[i]=='a'|| array[i]=='e'||array[i]=='i'|| array[i]=='o'||array[i]=='u'){
                    p=i;
                    break;
                }

            }
            if(Character.isUpperCase(name.charAt(0))){
                word=name.substring(p,p+1).concat(name.substring(p+1)).concat(name.substring(0,1)).toLowerCase().concat(name.substring(1,p).concat("ay"));
                displayTV.setText("Pig Latin: "+word.substring(0,1).toUpperCase()+word.substring(1));
            }else{
                word=name.substring(p).concat(name.substring(0,p).concat("ay"));
                displayTV.setText("Pig Latin: "+word);
            }

        }

    }
    public void clear(View v){
        EditText et = findViewById(R.id.et);
        TextView displayTV = findViewById(R.id.displayTV);
        String name = et.getText().toString();
        displayTV.setText("Pig Latin: ");
        et.setText("");
    }
}