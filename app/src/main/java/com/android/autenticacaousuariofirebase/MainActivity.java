package com.android.autenticacaousuariofirebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.signOut();

        if (firebaseAuth.getCurrentUser() != null ) {//ele retorna usuario atual ou null

            Log.i("LoginUser", "Usuario Logado");

        }else{
            Log.i("LoginUser", "Usuario Não Logodo");
        }
//        //login do usuario
//        firebaseAuth.signInWithEmailAndPassword("teste@teste.com", "teste1234")
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) { //sucesso ao cadastrar
//                            Log.i("LoginUser", "Sucesso ao Logar usuario");
//
//                        } else {//erro ao cadastrar
//                            Log.i("LoginUser", "Erro ao logar usuario");
//                        }
//
//                    }
//                });


//        //cadastro
//        firebaseAuth.createUs0erWithEmailAndPassword("teste@teste.com", "teste1234")
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()){ //sucesso ao cadastrar
//                            Log.i("CreateUser", "Sucesso ao criar usuario");
//
//                        }else{//erro ao cadastrar
//                            Log.i("CreateUser", "Erro ao criar usuario");
//                        }
//                    }
//                });
//    }
    }
}
