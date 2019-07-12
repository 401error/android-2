package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class box extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
        int num=getIntent().getIntExtra("data",-1);
        TextView t1=findViewById(R.id.boxview);
        t1.setText("当前消息框为："+(num+1));
    }
}
