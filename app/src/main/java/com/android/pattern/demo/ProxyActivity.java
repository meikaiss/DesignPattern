package com.android.pattern.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.pattern.proxy.ProxyTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meikai on 15/11/16.
 */
public class ProxyActivity extends Activity implements View.OnClickListener {

    private ListView listView;
    private List<String> tipList;

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);

        listView = (ListView) findViewById(R.id.list_view);

        tipList = new ArrayList<>();

        tipList.add("点击按钮开始代理");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, tipList);
        listView.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        ProxyTest proxyTest = new ProxyTest();

        proxyTest.testProxy(tipList);

        adapter.notifyDataSetChanged();
    }
}
