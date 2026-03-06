package memento.good_code;

public class EditorMemento {

    private final String content;

    public EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }



}
