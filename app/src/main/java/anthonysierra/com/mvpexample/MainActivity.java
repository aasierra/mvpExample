package anthonysierra.com.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewGroup contentView = (ViewGroup) findViewById(R.id.content);
        final View view = new View(contentView);
        final Model model = new Model();
        final Presenter presenter = new Presenter(view, model);
        //From here the view is loaded and setup to start interacting with the feature.
    }
}
