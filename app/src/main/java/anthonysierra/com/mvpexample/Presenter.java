package anthonysierra.com.mvpexample;

/**
 * The presenter responsible for business logic and looking at the state of the world and setting
 * things up.
 */

public class Presenter {

    final View view;
    final Model model;
    /**
     * This construtor will need a fully initialized view and model class.
     * @param view - The view that this presenter can set itself on.
     * @param model - The model that will be used by the presenter for updating the view.
     */
    public Presenter(final View view, final Model model) {
        this.view = view;
        this.model = model;
        this.view.setPresenter(this);
        this.view.updateView();
    }
}
