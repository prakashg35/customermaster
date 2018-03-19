import java.util.List;
 
import net.codejava.spring.model.Contact;
 
/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface ContactDAO {
     
    public void saveOrUpdate(contact contact);
     
    public void delete(int contactId);
     
    public contact get(int contactId);
     
    public List<contact> list();
}