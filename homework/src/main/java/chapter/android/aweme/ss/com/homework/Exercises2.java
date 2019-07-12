package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises2);

        View infal= LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        int a=getViewCount(infal);
        System.out.println("View count="+a);

        TextView t1 =findViewById(R.id.views);
        t1.setText("count="+a);
    }



    public static int getViewCount(View view) {
        //todo 补全你的代码
        int num=0;
        if(view instanceof ViewGroup)
        {
            ViewGroup viewGroup=(ViewGroup)view;
             num+=1;
            for(int i=0 ;i<viewGroup.getChildCount();i++)
            {
                  if(!(viewGroup.getChildAt(i)instanceof ViewGroup))
                  {
                        num++;
                  }
                  num+=getViewCount(viewGroup.getChildAt(i));
            }

        }

        return num;
    }
}
