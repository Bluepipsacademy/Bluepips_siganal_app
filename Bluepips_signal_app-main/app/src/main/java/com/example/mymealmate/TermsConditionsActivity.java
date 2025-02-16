package com.example.mymealmate;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class TermsConditionsActivity extends AppCompatActivity {


    private CheckBox checkBox;
    private Button button;
    private MaterialAlertDialogBuilder materialAlertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);





        checkBox = findViewById(R.id.checkbox_id);
        button = findViewById(R.id.button_id);

        materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);

        button.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TermsConditionsActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    materialAlertDialogBuilder.setTitle("Payment options");
                    materialAlertDialogBuilder.setMessage("Account details......");
                    materialAlertDialogBuilder.setPositiveButton("Paid", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int b) {
                            button.setEnabled(true);
                            dialogInterface.dismiss();

                        }
                    });

                    materialAlertDialogBuilder.setNegativeButton("Not yet", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            checkBox.setChecked(false);
                        }
                    });

                    materialAlertDialogBuilder.show();
                }else {
                    button.setEnabled(false);
                }
            }
        });
    }
}