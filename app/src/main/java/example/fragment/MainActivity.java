package example.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         fm = getSupportFragmentManager();

    }

    public void opencall(View v)
    {



        FragmentTransaction ft = fm.beginTransaction();
        Fragment cm = new Call_fragment();

        ft.replace(R.id.frame_id ,cm);

        ft.commit();

    }

    public void openchat(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment chat_frag = new chat_fragment();
        ft.replace(R.id.frame_id , chat_frag);

        ft.commit();

    }

    public void opencontact(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment contact_frag = new Contact_fragment();

        ft.replace(R.id.frame_id , contact_frag);


        ft.commit();
    }
}
