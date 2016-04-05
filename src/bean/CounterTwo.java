package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
@ApplicationScoped
@ManagedBean
public class CounterTwo implements Serializable{
    private int value = 0;

    public CounterTwo() {
    }

    public String increment(){
        value++;
        return "student_two";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
