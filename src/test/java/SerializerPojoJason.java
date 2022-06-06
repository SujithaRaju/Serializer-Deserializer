import com.sun.xml.internal.bind.v2.runtime.XMLSerializer;
import org.apache.juneau.annotation.Beanc;
import org.apache.juneau.collections.AList;
import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializerPojoJason {

    public static void main(String[] args) throws SerializeException {

      //POJO to JSON

       JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;
        List<String> details=new ArrayList<>();
        details.add("USA");
        details.add("9876543210");
       CustomersPOJO customersPOJO=new CustomersPOJO("Accounts","Sujitha","Raju", details);
       String jsonCustomers=jsonSerializer.serialize(customersPOJO);
        System.out.println(jsonCustomers);



        //POJO to XML

        XmlSerializer xmlSerializer=XmlSerializer.DEFAULT_NS;
        String xmlCustomer=xmlSerializer.serialize(customersPOJO);
        System.out.println(xmlCustomer);


        //POJO to HTML

        HtmlSerializer htmlSerializer=HtmlSerializer.DEFAULT;
        String htmlCustomer=htmlSerializer.serialize(customersPOJO);
        System.out.println(htmlCustomer);
    }
}
