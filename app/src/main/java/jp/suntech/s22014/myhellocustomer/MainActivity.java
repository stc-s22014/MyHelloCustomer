package jp.suntech.s22014.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        MyHelloCustomer listener = new  MyHelloCustomer();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btClear);
        //クリアボタンにリスナを取得
        btClear.setOnClickListener(listener);

        Button btClear2 = findViewById(R.id.btClear2);
        //クリアボタンにリスナを取得
        btClear2.setOnClickListener(listener);
    }

    private class MyHelloCustomer implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etName2);
            TextView output = findViewById(R.id.tvOutput);

            int id = v.getId();

            if (id == R.id.btClick) {
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                output.setText(inputStr + "にお住いの" + inputStr2 + "さん、こんにちは！");

            } else if (id == R.id.btClear) {
                input.setText("");
                output.setText("");
            } else if (id == R.id.btClear2) {
                input2.setText("");
                output.setText("");
            }
        }
    }
}