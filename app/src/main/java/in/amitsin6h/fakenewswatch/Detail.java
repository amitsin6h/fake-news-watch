package in.amitsin6h.fakenewswatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView title_one, content_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("News Detail");

        title_one = (TextView) findViewById(R.id.title_one);
        title_one.setText(R.string.title_two);

        content_one = (TextView) findViewById(R.id.content_one);
        content_one.setText(R.string.content_two);


    }
}
