package alexandre.vieira.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d(TAG, "onCreate: Tela de splash carregada...");
        
        trocarTela();
    }

    private void trocarTela() {
        Log.d(TAG, "trocarTela: Mudando de tela...");
        Intent trocarDeTela = new Intent (SplashActivity.this, MainActivity.class);
        startActivity(trocarDeTela);
        finish();
    }
}