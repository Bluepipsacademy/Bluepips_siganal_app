package com.example.mymealmate;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {


    EditText name,email,username;
    TextInputLayout pass;

    private FirebaseAuth auth;




    private CheckBox checkBox;
    private Button button;
    private MaterialAlertDialogBuilder materialAlertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        auth = FirebaseAuth.getInstance();




        name = findViewById(R.id.editText0);
        username = findViewById(R.id.editText);
        email = findViewById(R.id.editText2);
        pass = findViewById(R.id.editText14);




        checkBox = findViewById(R.id.checkbox_id);
        button = findViewById(R.id.buttonn);

        materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);

        button.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = Objects.requireNonNull(pass.getEditText()).toString();
                String userUserName = username.getText().toString();


                if (TextUtils.isEmpty(userName)){
                    Toast.makeText(RegisterActivity.this, "Enter full name!", Toast.LENGTH_SHORT).show();

                }

                if (TextUtils.isEmpty(userEmail)){
                    Toast.makeText(RegisterActivity.this, "Enter Email!", Toast.LENGTH_SHORT).show();

                }

                if (TextUtils.isEmpty(userPassword)){
                    Toast.makeText(RegisterActivity.this, "Enter password!", Toast.LENGTH_SHORT).show();
                    return;


                }

                if (TextUtils.isEmpty(userUserName)){
                    Toast.makeText(RegisterActivity.this, "Enter username!", Toast.LENGTH_SHORT).show();
                    return;

                }

                if (userPassword.length()<8){
                    Toast.makeText(RegisterActivity.this, "Password too short, enter minimum 8 character", Toast.LENGTH_SHORT).show();
                    return;
                }

                auth.createUserWithEmailAndPassword(userEmail,userPassword)
                        .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()){
                                    Toast.makeText(RegisterActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                                    startActivity(intent);
                                }else {
                                    Toast.makeText(RegisterActivity.this, "Registration Failed" +task.getException(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });


                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    materialAlertDialogBuilder.setTitle("Terms and Conditions");
                    materialAlertDialogBuilder.setMessage("Bluepips Trading Academy: Terms and Conditions\n" +
                    "\n" +
                    "TERMS AND CONDITIONS OF BLUEPIPS TRADING ACADEMY\n" +
                    "\n" +
                    "1. ACCEPTANCE OF TERMS\n" +
                    "1.1 By accessing and utilizing the Bluepips Trading Academy website, courses, and services (collectively, the \"Services\"), you (\"User\") acknowledge that you have read, understood, and agree to be bound by these Terms and Conditions.\n" +
                    "\n" +
                    "2. EDUCATIONAL PURPOSE\n" +
                    "2.1 The User acknowledges that the Services are provided for educational purposes only.\n" +
                    "2.2 The Services do not constitute personalized financial advice, and any information provided is general in nature.\n" +
                    "\n" +
                    "3. LIMITATION OF LIABILITY\n" +
                    "3.1 In no event shall Bluepips Trading Academy, its officers, directors, employees, agents, or affiliates (collectively, the \"Academy\") be liable for any damages, including but not limited to incidental, consequential, or punitive damages, arising out of the use of the Services.\n" +
                    "\n" +
                    "4. INDEMNIFICATION\n" +
                    "4.1 The User agrees to indemnify, defend, and hold harmless the Academy from and against any and all claims, damages, losses, and expenses, including reasonable attorneys' fees, arising out of or related to the use of the Services.\n" +
                    "\n" +
                    "5. GOVERNING LAW\n" +
                    "5.1 These Terms and Conditions shall be governed by and construed in accordance with the laws of the jurisdiction where Bluepips Trading Academy is located.\n" +
                    "\n" +
                    "6. DISPUTE RESOLUTION\n" +
                    "6.1 Any disputes arising out of or related to these Terms and Conditions shall be resolved through arbitration in accordance with the rules of the arbitration association in the jurisdiction where Bluepips Trading Academy is located.\n" +
                    "\n" +
                    "7. SOCIAL MEDIA AND ONLINE CONDUCT\n" +
                    "7.1 The User agrees not to engage in any social media or online conduct that may harm the reputation of the Academy or its representatives.\n" +
                    "7.2 The User acknowledges that any such conduct may result in legal action, including but not limited to damages and injunctive relief.\n" +
                    "\n" +
                    "IMPORTANT DISCLAIMER\n" +
                    "\n" +
                    "BLUEPIPS TRADING ACADEMY AND ITS REPRESENTATIVES ARE NOT LIABLE FOR ANY FINANCIAL COMMITMENTS OR INVESTMENTS MADE ON TRADING OR BY THE USE OF ITS PLATFORMS. THE SERVICES ARE PROVIDED FOR EDUCATIONAL PURPOSES ONLY, AND NO GUARANTEE OR TESTIMONIES OF PAST RESULTS ARE MEANT TO CONSTITUTE FINANCIAL ADVICE.\n" +
                    "\n" +
                    "1. Acceptance of Terms\n" +
                    "By accessing or using any part of the Bluepips Trading Academy website, services, courses, or any related materials (collectively, the \"Services\"), you agree to be bound by these Terms and Conditions (\"Terms\"). If you do not agree to these Terms, you may not access or use the Services.\n" +
                    "2. Services\n" +
                    "The Services may provide educational content related to trading and investing, including but not limited to:\n" +
                    " * Online Courses: Access to video lessons, and other educational resources on various trading topics.\n" +
                    " * Live Webinars/Workshops: Participation in live online sessions with instructors.\n" +
                    " * Community Forums: (If applicable) Access to online forums or groups for interaction with other students and instructors.\n" +
                    " * Mentorship Programs: (If applicable) Access to mentorship programs with experienced traders.\n" +
                    "3. Disclaimer of Investment Advice\n" +
                    "The Services are for educational purposes only. Bluepips Trading Academy and its instructors do not provide financial, investment, or tax advice. Any trading or investment decisions made by you are solely your responsibility and should be based on your own research and independent judgment.\n" +
                    "Past performance is not indicative of future results. Any testimonials or success stories presented are not guarantees of future earnings or profits.\n" +
                    "4. Limitation of Liability\n" +
                    "In no event shall Bluepips Trading Academy, its instructors, affiliates, or any of their respective officers, directors, employees, agents, or licensors be liable for any direct, indirect, incidental, special, consequential, or punitive damages arising out of or in connection with your use of the Services, including but not limited to:\n" +
                    " * Trading Losses: Any losses incurred as a result of trading decisions made based on the information provided in the Services.\n" +
                    " * Investment Losses: Any losses incurred as a result of investment decisions made based on the information provided in the Services.\n" +
                    " * Data Loss: Any loss of data or other information transmitted or stored by the Services.\n" +
                    " * Service Interruptions: Any interruptions or disruptions to the Services.\n" +
                    "5. Intellectual Property\n" +
                    "All content within the Services, including but not limited to text, images, videos, logos, and trademarks, is the property of Bluepips Trading Academy or its licensors and is protected by copyright and other intellectual property laws. You may not reproduce, distribute, modify, or create derivative works of any such content without the prior written consent of Bluepips Trading Academy.\n" +
                    "6. Indemnification\n" +
                    "You agree to indemnify and hold harmless Bluepips Trading Academy, its instructors, affiliates, and any of their respective officers, directors, employees, agents, and licensors from and against any and all claims, liabilities, damages, losses, costs, and expenses (including attorneys' fees) arising out of or in connection with your use of the Services, your violation of these Terms, or your violation of any rights of another.\n" +
                    "7. Release of Claims\n" +
                    "You hereby release Bluepips Trading Academy, its instructors, affiliates, and any of their respective officers, directors, employees, agents, and licensors from any and all claims, liabilities, demands, and causes of action of every kind and nature, known and unknown, arising out of or relating to your use of the Services.\n" +
                    "8. Right to Sue\n" +
                    "Bluepips Trading Academy reserves the right to pursue legal action against any individual or entity that engages in any form of defamation, libel, slander, cyberbullying, or other forms of online harassment or defamation directed towards Bluepips Trading Academy, its instructors, affiliates, or any of their respective officers, directors, employees, agents, or licensors. This includes but is not limited to:\n" +
                    " * Social Media Defamation: Making false or misleading statements about Bluepips Trading Academy or its services on social media platforms.\n" +
                    " * Online Harassment: Engaging in any form of online harassment, including but not limited to cyberbullying, stalking, and threats.\n" +
                    " * Name Tarnishing: Engaging in any activity that damages the reputation of Bluepips Trading Academy or its services.\n" +
                    "9. No Refund Policy\n" +
                    "All purchases of Bluepips Trading Academy Services are final and non-refundable. This includes, but is not limited to, online courses, live webinars, workshops, and mentorship programs.\n" +
                    "10. Changes to Terms\n" +
                    "Bluepips Trading Academy reserves the right to modify or update these Terms at any time without prior notice. You are responsible for reviewing these Terms periodically for any changes. Your continued use of the Services following the posting of any changes to these Terms constitutes acceptance of those changes.\n" +
                    "11. Governing Law\n" +
                    "These Terms shall be governed by and construed in accordance with the laws of [Insert Applicable Jurisdiction], without regard to its conflict of law principles.\n" +
                    "12. Entire Agreement\n" +
                    "These Terms constitute the entire agreement between you and Bluepips Trading Academy with respect to the subject matter hereof and supersede all prior or contemporaneous communications, representations, and understandings, whether oral or written.\n" +
                    "13. Severability\n" +
                    "If any provision of these Terms is held to be invalid or unenforceable, such provision shall be struck and the remaining provisions shall be enforced.\n" +
                    "14. Contact\n" +
                    "If you have any questions regarding these Terms, please contact us at [Insert Contact Information].\n" +
                    "[Hidden Section]\n" +
                    "Disclaimer: Bluepips Trading Academy and its team or anyone connected to it are not liable for any financial commitments and investments made on trading or by the use of its platforms. The Services are for educational purposes only and do not constitute financial advice. No guarantee or testimonies of past results should be considered as financial advice.");

                    materialAlertDialogBuilder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int b) {
                            button.setEnabled(true);
                            dialogInterface.dismiss();

                        }
                    });
                    materialAlertDialogBuilder.show();
                }else {
                    button.setEnabled(false);
                }
            }
        });
    }

    public void login(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }


    public void sub(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }
}


