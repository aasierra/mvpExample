package anthonysierra.com.mvpexample;

import android.view.ViewGroup;
import android.widget.TextView;

/**
 * The view that will govern, things such as how to set a text fields color given x.
 * The reason that this class even exists is to not tie us to using an activity fragment.
 */

public class View {
    final ViewGroup view;
    Presenter presenter;
    /**
     * The constructor that takes in the view that it needs to be manipulating as well as the presenter
     * that it needs to call when user events happen.
     * @param container - The container for the view.
     */
    public View(final ViewGroup container) {
        this.view = container;
    }

    /**
     * This is called after configuration changes or first initialization to set the presenter on the view.
     * @param presenter
     */
    public void setPresenter(final Presenter presenter) {
        this.presenter = presenter;
    }

    public void updateView() {
        ((TextView)this.view.findViewById(R.id.hello)).setText("Feature ready!");
    }
}
