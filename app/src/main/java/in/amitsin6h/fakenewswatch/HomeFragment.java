package in.amitsin6h.fakenewswatch;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView title_one, content_one, title_two, content_two, title_three, content_three;
    CardView card_view_two;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        title_one = (TextView) rootView.findViewById(R.id.title_one);
        title_one.setText(R.string.title_one);

        content_one = (TextView) rootView.findViewById(R.id.content_one);
        content_one.setText(R.string.content_one);


        title_two = (TextView) rootView.findViewById(R.id.title_two);
        title_two.setText(R.string.title_two);

        content_two = (TextView) rootView.findViewById(R.id.content_two);
        content_two.setText(R.string.content_two);


        title_three = (TextView) rootView.findViewById(R.id.title_three);
        title_three.setText(R.string.title_three);

        content_three = (TextView) rootView.findViewById(R.id.content_three);
        content_three.setText(R.string.content_three);


        card_view_two = (CardView) rootView.findViewById(R.id.card_view_two);
        card_view_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Detail.class);
                startActivity(intent);

                //Toast.makeText(getContext(), "Hello",Toast.LENGTH_LONG).show();
            }
        });



        return rootView;
    }

}
