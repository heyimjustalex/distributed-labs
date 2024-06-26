package RESTDictionaryExercise.beans;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Word {

    private String name;
    private String definition;

    public Word() {
    }

    public Word(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
