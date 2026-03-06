package memento.good_code;

// Manage mementos ( snopshorts of the textEditor)

import java.util.Stack;

public class CareTaker {

    public final Stack<EditorMemento>hisory = new Stack<>();

    public void saveState(TextEditor nextForm) {
        hisory.push(nextForm.save());
    }

    public void undo(TextEditor editor){
        if(hisory.isEmpty()){
            return;
        }
        hisory.pop();
        editor.restore(hisory.peek() );

    }
}
