package com.android.pattern.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.pattern.decorator.Test;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView;

    private Class<?>[] activityClsArr = {CalculaterActivity.class, StrategyActivity.class};
    private String[] patternNameArr = {"简单工厂模式", "策略模式"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        DemoListAdapter adapter = new DemoListAdapter(this, activityClsArr, patternNameArr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

        Test t = new Test();
        t.testDecorator();
    }

    private List<String> arr2List(Class[] activityNameArr) {

        List<String> activityList = new ArrayList<>();

        for (int i = 0; i < activityNameArr.length; i++) {
            activityList.add(activityNameArr[i].getSimpleName());
        }

        return activityList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        startActivity(new Intent(MainActivity.this, activityClsArr[position]));
    }

    private static class DemoListAdapter extends BaseAdapter{

        private Context context;
        private Class<?>[] activityClsArr;
        private String[] patternName;

        public DemoListAdapter(Context context, Class<?>[] activityClsArr, String[] patternName) {
            this.context = context;
            this.activityClsArr = activityClsArr;
            this.patternName = patternName;
        }

        @Override
        public int getCount() {
            return activityClsArr.length;
        }

        @Override
        public Object getItem(int position) {
            return activityClsArr[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;
            if(convertView == null){
                convertView = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false);
                new ViewHolder(convertView);
            }

            viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.activityNameTV.setText(activityClsArr[position].getSimpleName());
            viewHolder.patternNameTV.setText(patternName[position]);

            return convertView;
        }

        private class ViewHolder{
            public TextView activityNameTV;
            public TextView patternNameTV;

            public ViewHolder(View view) {
                activityNameTV = (TextView) view.findViewById(R.id.tv_activity_name);
                patternNameTV = (TextView) view.findViewById(R.id.tv_pattern_name);
                view.setTag(this);
            }
        }
    }
}
