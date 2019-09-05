package c.ankur.timepass;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SimpleFragment extends Fragment {
    View view;
    Button firstbutton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_simple,container,false);
        //get reference of button
        firstbutton=view.findViewById(R.id.firstButton);
        //perform setonClickListener on first button
        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
