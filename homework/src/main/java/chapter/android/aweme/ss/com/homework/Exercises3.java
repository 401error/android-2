package chapter.android.aweme.ss.com.homework;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Toast;


/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises_mesaage);
        ListView list =findViewById(R.id.listview);
        list.setAdapter(new ListViewAdapter(this));



      list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(Exercises3.this, "当前位置" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Exercises3.this, box.class);
                intent.putExtra("data", position);
//                Intent intent = null;
//                try {
//                    intent = new Intent(ListViewActivity.this, Class.forName("com.ss.android.ugc.chapter1.MainActivity"));
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
                startActivity(intent);
            }
        });


    }
    public static class ListViewAdapter extends BaseAdapter {

        private Context mContext;

        public ListViewAdapter(Context context) {
            mContext = context;
        }

        @Override public int getCount() {
            return 40;
        }

        @Override public Object getItem(int position) {
            return null;
        }

        @Override public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.im_list_item, null);
                Log.d("ListViewAdapter",
                        "getView() called with: position = [" + position + "], convertView = [" + convertView + "], parent = [" +
                                parent + "]");
            } else {
                //!=null
                view = convertView;
            }

            return view;
        }
    }


}
