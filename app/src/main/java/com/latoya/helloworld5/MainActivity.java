package com.latoya.helloworld5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_700));
            }
        });
        // User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.black));
                // change text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));

            }
        });
        // User can tap a button to change text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });
        // User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset text to "Hello from LaToya" id - text
                textView.setText("Hello from LaToya");
                // 2. Reset color of text to original color
                textView.setTextColor(getResources().getColor(R.color.white));
                // original text color - black, text id - @id/text
                // 3. Reset background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));
                // original background color - R.color.light_purple
            }
        });
        // User can update the label text with custom text entered into the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what's in the edit text view
               String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                // if text field is empty, update label with default text string
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text");
                } else {
                    textView.setText(userEnteredText);
                }


            }
        });


    }
}