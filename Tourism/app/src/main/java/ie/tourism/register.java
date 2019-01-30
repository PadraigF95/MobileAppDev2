package ie.tourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;


public class register extends AppCompatActivity {
    private EditText registerEmail, registerPassword, registerUsername;
    private Button btnregister;
    private FirebaseAuth fireaseauth;
    String regEmail, regpassword, regname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
}
