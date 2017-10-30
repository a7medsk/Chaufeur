package com.example.a7med.chaufeur;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;


public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.sign_in_button)
    Button signInButton;
    @BindView(R.id.password)
    TextView editPassword;
    @BindView(R.id.pseudo)
    EditText editMail;
    @BindView(R.id.login_form)
    LinearLayout loginForm;
    //@BindView(R.id.login_progress)
    //ProgressBar progressBar;
    @BindView(R.id.image_view_loader)
    ImageView loader;

    private AnimationDrawable frameAnimation;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion_layout);
        ButterKnife.bind(this);



        mAuth = FirebaseAuth.getInstance();

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager imm = (InputMethodManager)LoginActivity.this.
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(editPassword.getWindowToken(), 0);

                if (!editPassword.getText().toString().equals("")  && !editMail.getText().toString().equals("")) {

//                    loader.setVisibility(View.VISIBLE);
//                    frameAnimation.start();

                    mAuth.signInWithEmailAndPassword(editMail.getText().toString()
                            , editPassword.getText().toString())
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {


                                    if (task.isSuccessful()) {

                                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                                        startActivity(intent);

                                        //FirebaseUser user = mAuth.getCurrentUser();
                                        //updateUI(user);
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Log.w("TAG", "signInWithEmail:failure", task.getException());
                                        Toast.makeText(LoginActivity.this, getString(R.string.auth_failed),
                                                Toast.LENGTH_SHORT).show();
                                        //updateUI(null);
                                    }

                                }
                            });
                }else{

                    //Toast.makeText(LoginActivity.this,getString(R.string.fill_all_input),
                      //      Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                    startActivity(intent);
                    finish();

                }

            }
        });

    }






}
