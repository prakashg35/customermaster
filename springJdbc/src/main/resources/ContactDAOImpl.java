import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;
 
import net.codejava.spring.model.Contact;
 
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
 
/**
 * An implementation of the ContactDAO interface.
 * @author www.codejava.net
 *
 */
public class ContactDAOImpl implements ContactDAO 
{
 
    private JdbcTemplate jdbcTemplate;
 
    public ContactDAOImpl(DataSource dataSource) 
    {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public void saveOrUpdate(Contact contact) 
    {
    	if (contact.getId() > 0) 
    	{
            String sql = "UPDATE customer SET name=?, contactPerson= ?, location=?, contactno=?, email=? WHERE contact_id=?";
            jdbcTemplate.update(sql, contact.getName(), contact.getContactPerson(), contact.getLocation(), contact.getContactno(), contact.getEmail(), contact.getId());
        } 
    	else 
    	{
            String sql = "INSERT INTO customer (name, contactPerson, location, contactno, email) VALUES (?, ?, ?, ?,?)";
            jdbcTemplate.update(sql, contact.getName(), contact.getContactPerson(), contact.getLocation(), contact.getContactno(), contact.getEmail());
        }
     }
 
    @Override
    public void delete(int contactId) 
    {
    	public void delete(int contactId) 
    	{
    	    String sql = "DELETE FROM customer WHERE contact_id=?";
    	    jdbcTemplate.update(sql, contactId);
    	}
    }
 
    @Override
    public List<Contact> list() 
    {
    	String sql = "SELECT * FROM customer";
        List<customer> listContact = jdbcTemplate.query(sql, new RowMapper<customer>() {
     
            @Override
            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                Contact aContact = new Contact();
     
                aContact.setId(rs.getInt("id"));
                aContact.setName(rs.getString("name"));
                aContact.setContactPerson(rs.getString("contactPerson"));
                aContact.setLocation(rs.getString("location"));
                aContact.setContactno(rs.getString("contactno"));
                aContact.setEmail(rs.getString("email"));
     
                return aContact;
            }
     
        });
     
        return listContact;
    }
 
    @Override
    public contact get(int contactId) 
    {
    	 String sql = "SELECT * FROM customer WHERE contact_id=" + contactId;
    	    return jdbcTemplate.query(sql, new ResultSetExtractor<customer>() {
    	 
    	        @Override
    	        public Contact extractData(ResultSet rs) throws SQLException,
    	                DataAccessException {
    	            if (rs.next()) {
    	                Contact contact = new Contact();
    	               contact.setId(rs.getInt("contact_id"));
    	                contact.setName(rs.getString("name"));
    	                contact.setContactPerson(rs.getString("contactPerson"));
    	                contact.setLocation(rs.getString("location"));
    	                contact.setContactno(rs.getString("contactno"));
    	                contact.setEmail(rs.getString("email"));
    	                
    	                return contact;
    	            }
    	 
    	            return null;
    	        }
    	 
    	    }); 
    	    }
 
}