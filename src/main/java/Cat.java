import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Cat {
    private String message;
    public void setMessage (String message) {
        this.message = message;
    }
    public String getMessage (){
        return message;
    }
}
