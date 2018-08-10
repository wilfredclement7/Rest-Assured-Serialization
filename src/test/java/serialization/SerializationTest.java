package serialization;

//import testing.User;
//import java.util.HashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import serialization.Input;

public class SerializationTest {
 
    public static void main(String[] args) throws Exception {
        Input user = new Input();
        user.setId("0001");
        user.setType("donut");
    	user.setName("cake");
        user.setPpu(0.55);
        //user.getBatters().getBatter().add(null);
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
         
        String json = mapper.writeValueAsString(user);
        System.out.println(json);
    }
}