package com.android.pattern.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.android.pattern.decorator.DecoratorTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meikai on 15/11/15.
 */
public class DecoratorActivity extends Activity {

    ListView listView;

    List<String> dataList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listView = new ListView(this);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        listView.setLayoutParams(lp);

        Button btn = new Button(this);
        btn.setText("开始装饰");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecoratorTest decoratorTest = new DecoratorTest();
                decoratorTest.testDecorator(dataList);

                adapter.notifyDataSetChanged();
            }
        });

        listView.addHeaderView(btn);

        setContentView(listView);

        dataList = new ArrayList<>();
        dataList.add("装饰模式的测试用例");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, dataList);

        listView.setAdapter(adapter);




    }
}
