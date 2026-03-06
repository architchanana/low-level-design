package memento.good_code;

public class Main {
    static void main(String[] args) {
        TextEditor edit = new TextEditor();
        CareTaker careTaker = new CareTaker();

        edit.write("A");
        careTaker.saveState(edit);
        edit.write("B");
        careTaker.saveState(edit);
        edit.write("C");
        careTaker.saveState(edit);

        careTaker.undo(edit);
        careTaker.undo(edit);

        System.out.println(edit.getContent());

    }
}
