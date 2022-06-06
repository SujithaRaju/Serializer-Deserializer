import org.apache.juneau.html.HtmlParser;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.xml.XmlParser;

public class DeSerializerJsonPojo {

    public static void main(String[] args) throws ParseException {

        //JSON to POJO
        JsonParser jsonParser = JsonParser.DEFAULT;
        String jsonValue = "{\n" +
                "\t\"branch\": \"Accounts\",\n" +
                "\t\"customer_Details\": [\n" +
                "\t\t\"USA\",\n" +
                "\t\t\"9876543210\"\n" +
                "\t],\n" +
                "\t\"customer_First_Name\": \"Sujitha\",\n" +
                "\t\"customer_Last_Name\": \"Raju\"\n" +
                "}";


        CustomersPOJO customersPOJOs = jsonParser.parse(jsonValue, CustomersPOJO.class);
        System.out.println(customersPOJOs);

        //XML to POJO
        XmlParser xmlParser=XmlParser.DEFAULT;
        String xmlValue="<object><branch>Accounts</branch><customer_Details><string>USA</string><string>9876543210</string></customer_Details><customer_First_Name>Sujitha</customer_First_Name><customer_Last_Name>Raju</customer_Last_Name></object>";
        CustomersPOJO customersPOJO1=xmlParser.parse(xmlValue,CustomersPOJO.class);
        System.out.println(customersPOJO1);


        //HTML to POJO
        HtmlParser htmlParser=HtmlParser.DEFAULT;
        String htmlValue="<table><tr><td>branch</td><td>Accounts</td></tr><tr><td>customer_Details</td><td><ul><li>USA</li><li>9876543210</li></ul></td></tr><tr><td>customer_First_Name</td><td>Sujitha</td></tr><tr><td>customer_Last_Name</td><td>Raju</td></tr></table>";
        CustomersPOJO customersPOJO2=htmlParser.parse(htmlValue,CustomersPOJO.class);
        System.out.println(customersPOJO2);
    }
}

