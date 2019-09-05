package c.ankur.timepass;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SecondFragment extends Fragment {
    View view;
    Button secondButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.fragment_simple_sec,container,false);
        //get reference of button
        secondButton=view.findViewById(R.id.button);
        //perform setonClickListener on first button
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);*/
                Toast.makeText(getActivity(), "hey you are here", Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
