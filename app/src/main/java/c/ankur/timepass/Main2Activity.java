package c.ankur.timepass;



import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends Activity {
Button Firstfragment,Secondfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Firstfragment = findViewById(R.id.firstFragment);
        Secondfragment= findViewById(R.id.secondFragment);

        Firstfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());

            }
        });

        Secondfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }



    private void loadFragment(Fragment fragment) {
        //Create fragment manager
        FragmentManager fm= getFragmentManager();
        //Create a fragmentTransaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }


}
