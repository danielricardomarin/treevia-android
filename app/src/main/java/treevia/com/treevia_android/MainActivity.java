package treevia.com.treevia_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_LOGIN = 0;

    //@InjectView(R.id.link_login) TextView _loginlink;
    TextView _loginlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _loginlink = (TextView) findViewById(R.id.link_login);

        _loginlink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivityForResult(intent, REQUEST_LOGIN);
            }
        });
    }
}
