 package kr.teamcadi.dh.project1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTheme(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen);

    }
}
