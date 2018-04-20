package studentcontroller;

import javax.faces.bean.ManagedBean;
import data.model.*;

@ManagedBean(name="studentcontroller")

public class studentcontroller {

    private student student = new student();

    public data.model.student getStudent() {
        return student;
    }

    public void setStudent(data.model.student student) {
        this.student = student;
    }

    public String isNext(){
        return "sucess";
    }
}