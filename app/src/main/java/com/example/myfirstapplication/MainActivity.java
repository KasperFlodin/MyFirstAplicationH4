package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        buttonClickingandLollygagging();
        inputThyName();

    }

    private void inputThyName() {
        EditText nameInput = findViewById(R.id.inp_name);
        Button btn_input = findViewById(R.id.btn_inputbtn);
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                Toast.makeText(getApplicationContext(), "" + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
//    private void buttonClickingandLollygagging() {
//        Button btn = findViewById(R.id.btn_mybutton);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (btn.getText() == "I dare you to click me again!!!")
//                    btn.setText("You did it again didnt you??");
//                else
//                    btn.setText("I dare you to click me again!!!");
//            }
//        });
//    }
}