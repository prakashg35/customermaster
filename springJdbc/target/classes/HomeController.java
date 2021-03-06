
public class HomeController {
	 @Autowired
	    private ContactDAO contactDAO;
	 @RequestMapping(value="/")
	 public ModelAndView listContact(ModelAndView model) throws IOException{
	     List<customer> listcustomer = contactDAO.list();
	     model.addObject("listcustomer", listcustomer);
	     model.setViewName("home");
	  
	     return model;
	 }
	 @RequestMapping(value = "/newContact", method = RequestMethod.GET)
	 public ModelAndView newContact(ModelAndView model) {
	     Contact newContact = new Contact();
	     model.addObject("customer", newContact);
	     model.setViewName("ContactForm");
	     return model;
	 }
	 @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	 public ModelAndView saveContact(@ModelAttribute Contact contact) {
	     contactDAO.saveOrUpdate(contact);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	 public ModelAndView deleteContact(HttpServletRequest request) {
	     int contactId = Integer.parseInt(request.getParameter("id"));
	     contactDAO.delete(contactId);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping(value = "/editContact", method = RequestMethod.GET)
	 public ModelAndView editContact(HttpServletRequest request) {
	     int contactId = Integer.parseInt(request.getParameter("id"));
	     Contact contact = contactDAO.get(contactId);
	     ModelAndView model = new ModelAndView("ContactForm");
	     model.addObject("contact", contact);
	  
	     return model;
	 }

}
