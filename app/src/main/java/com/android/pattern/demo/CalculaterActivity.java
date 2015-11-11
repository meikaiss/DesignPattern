package com.android.pattern.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.pattern.libcalculater.Operation;
import com.android.pattern.libcalculater.OperatonFactory;


/**
 * Created by meikai on 15/11/9.
 * 简单工厂
 */
public class CalculaterActivity extends Activity implements View.OnClickListener {

    private EditText edtOp1;
    private EditText edtOp2;
    private EditText edtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        edtOp1 = (EditText) findViewById(R.id.edt_op1);
        edtOp2 = (EditText) findViewById(R.id.edt_op2);
        edtResult = (EditText) findViewById(R.id.edt_resutl);

    }


    @Override
    public void onClick(View v) {

        onClickHandler1(v);

    }

    private void onClickHandler1(View v){

        try {
            Operation operation = null;
            int result = 0;
            operation = OperatonFactory.createOperation(((Button) v).getText().toString());
            operation.setNumber1(Integer.parseInt(edtOp1.getText().toString()));
            operation.setNumber2(Integer.parseInt(edtOp2.getText().toString()));
            result = operation.operat();

            edtResult.setText(String.valueOf(result));
        }catch (Exception e){
            Toast.makeText(this, "请填写正确的数据", Toast.LENGTH_SHORT).show();
        }

    }

    private void onClickHandler2(View v){

        switch (v.getId()){
            case R.id.btn_add:

                break;
            case R.id.btn_sub:

                break;
            case R.id.btn_mul:

                break;
            case R.id.btn_div:

                break;
            default:
                break;
        }

    }

}
