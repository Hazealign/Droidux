package info.izumin.android.droidux.processor.fixture;

/**
 * Created by izumin on 11/2/15.
 */
public final class Source {
    public static final String TAG = Source.class.getSimpleName();

    public static class Counter {
        public static final String[] TARGET = {
                "package info.izumin.android.droidux.sample;",
                "import info.izumin.android.droidux.annotation.Dispatchable;",
                "import info.izumin.android.droidux.annotation.Reducer;",
                "import info.izumin.android.droidux.processor.fixture.IncrementCountAction;",
                "import info.izumin.android.droidux.processor.fixture.Counter;",
                "@Reducer(Counter.class)",
                "public class CounterReducer {",
                "    @Dispatchable(IncrementCountAction.class)",
                "    public Counter onIncrement(Counter state) {",
                "        return state;",
                "    }",
                "}"
        };

        public static final String[] GENERATED = {
                "package info.izumin.android.droidux.sample;",
                "",
                "import info.izumin.android.droidux.Action;",
                "import info.izumin.android.droidux.Store;",
                "import info.izumin.android.droidux.processor.fixture.Counter;",
                "import info.izumin.android.droidux.processor.fixture.IncrementCountAction;",
                "",
                "public final class DroiduxCounterStore extends Store<Counter> {",
                "    private final CounterReducer counterReducer;",
                "",
                "    protected DroiduxCounterStore(Builder builder) {",
                "        super(builder);",
                "        this.counterReducer = builder.counterReducer;",
                "    }",
                "",
                "    @Override",
                "    protected void dispatchToReducer(Action action) {",
                "        Class<? extends Action> actionClass = action.getClass();",
                "        Counter result = null;",
                "        if (actionClass.isAssignableFrom(IncrementCountAction.class)) {",
                "            result = counterReducer.onIncrement(getState());",
                "        }",
                "        if (result != null) {",
                "            setState(result);",
                "        }",
                "    }",
                "",
                "    public static class Builder extends info.izumin.android.droidux.Store.Builder {",
                "        private CounterReducer counterReducer;",
                "",
                "        public Builder() {",
                "            super();",
                "        }",
                "",
                "        public Builder addReducer(CounterReducer counterReducer) {",
                "            this.counterReducer = counterReducer;",
                "            return this;",
                "        }",
                "",
                "        @Override",
                "        public DroiduxCounterStore build() {",
                "            return new DroiduxCounterStore(this);",
                "        }",
                "    }",
                "}"
        };
    }

    public static class TodoList {
        public static final String[] TARGET = {
                "package info.izumin.android.droidux.sample;",
                "import info.izumin.android.droidux.annotation.Dispatchable;",
                "import info.izumin.android.droidux.annotation.Reducer;",
                "import info.izumin.android.droidux.processor.fixture.AddTodoItemAction;",
                "import info.izumin.android.droidux.processor.fixture.CompleteTodoItemAction;",
                "import info.izumin.android.droidux.processor.fixture.TodoList;",
                "@Reducer(TodoList.class)",
                "public class TodoListReducer {",
                "    @Dispatchable(AddTodoItemAction.class)",
                "    public TodoList onAddItem(TodoList state) {",
                "        return state;",
                "    }",
                "    @Dispatchable(CompleteTodoItemAction.class)",
                "    public TodoList onCompleteItem(TodoList state) {",
                "        return state;",
                "    }",
                "}"
        };

        public static final String[] GENERATED = {
                "package info.izumin.android.droidux.sample;",
                "",
                "import info.izumin.android.droidux.Action;",
                "import info.izumin.android.droidux.Store;",
                "import info.izumin.android.droidux.processor.fixture.AddTodoItemAction;",
                "import info.izumin.android.droidux.processor.fixture.CompleteTodoItemAction;",
                "import info.izumin.android.droidux.processor.fixture.TodoList;",
                "",
                "public final class DroiduxTodoListStore extends Store<TodoList> {",
                "    private final TodoListReducer todoListReducer;",
                "",
                "    protected DroiduxTodoListStore(Builder builder) {",
                "        super(builder);",
                "        this.todoListReducer = builder.todoListReducer;",
                "    }",
                "",
                "    @Override",
                "    protected void dispatchToReducer(Action action) {",
                "        Class<? extends Action> actionClass = action.getClass();",
                "        TodoList result = null;",
                "        if (actionClass.isAssignableFrom(AddTodoItemAction.class)) {",
                "            result = todoListReducer.onAddItem(getState());",
                "        }",
                "        if (actionClass.isAssignableFrom(CompleteTodoItemAction.class)) {",
                "            result = todoListReducer.onCompleteItem(getState());",
                "        }",
                "        if (result != null) {",
                "            setState(result);",
                "        }",
                "    }",
                "",
                "    public static class Builder extends info.izumin.android.droidux.Store.Builder {",
                "        private TodoListReducer todoListReducer;",
                "",
                "        public Builder() {",
                "            super();",
                "        }",
                "",
                "        public Builder addReducer(TodoListReducer todoListReducer) {",
                "            this.todoListReducer = todoListReducer;",
                "            return this;",
                "        }",
                "",
                "        @Override",
                "        public DroiduxTodoListStore build() {",
                "            return new DroiduxTodoListStore(this);",
                "        }",
                "    }",
                "}"
        };
    }
}