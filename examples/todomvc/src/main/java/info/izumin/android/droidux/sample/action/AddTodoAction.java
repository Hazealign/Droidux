package info.izumin.android.droidux.sample.action;

import com.google.gson.Gson;

import info.izumin.android.droidux.Action;

/**
 * Created by izumin on 11/4/15.
 */
public class AddTodoAction extends Action {
    public static final String TAG = AddTodoAction.class.getSimpleName();

    private final String text;

    public AddTodoAction(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}