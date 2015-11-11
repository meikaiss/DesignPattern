package com.android.pattern.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.pattern.strategy.CashContext;
import com.android.pattern.strategy.CashNormal;
import com.android.pattern.strategy.CashReback;
import com.android.pattern.strategy.CashRebate;

/**
 * Created by meikai on 15/11/11.
 */
public class StrategyActivity extends Activity implements View.OnClickListener {

    private EditText edtTotal;
    private RadioGroup radioGroup;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);

        edtTotal = (EditText) findViewById(R.id.edt_total);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        tvResult = (TextView) findViewById(R.id.tv_result);

    }

    @Override
    public void onClick(View v) {

        try {
            Float.parseFloat(edtTotal.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "请填写正确的总金额", Toast.LENGTH_SHORT).show();
            return;
        }

        CashContext cashContext = null;
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rb_01:
                cashContext = new CashContext(new CashNormal());
                break;
            case R.id.rb_02:
                cashContext = new CashContext(new CashReback(300, 100));
                break;
            case R.id.rb_03:
                cashContext = new CashContext(new CashRebate(0.8f));
                break;
            default:
                break;
        }

        float result = cashContext.getAcceptCash(Float.parseFloat(edtTotal.getText().toString()));

        tvResult.setText(result + "");

    }
}
