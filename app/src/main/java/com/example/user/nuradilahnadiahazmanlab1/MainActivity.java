package com.example.user.nuradilahnadiahazmanlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById (R.id.button);
        resetButton = (Button) findViewById (R.id.button2);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);
    }

    public void displayText (View view)
    {
        String text =etName.getText().toString();
        //display text obtain from getText
        tvMessage.setText("WELCOME "+ text);

        //show toast
        Toast toast = Toast.makeText(this,"WELCOME " + text , Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText (View view)
    {
        etName.getText().clear();
        Toast toast = Toast.makeText(this,"NAME HAVE BEEN RESET" , Toast.LENGTH_SHORT);
        toast.show();

        tvMessage.setText("WELCOME ");

    }
}
