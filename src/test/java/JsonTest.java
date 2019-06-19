import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class JsonTest {
    @Test
    public void jsonTest() throws JSONException {
        JSONObject jo = new JSONObject();
        jo.put("a",0);
        jo.put("b",1);
        String  a = jo.optString("a");
        String  b = jo.optString("b");

        System.out.println("++++"+a);
        System.out.println("++++"+b);
    }
}
