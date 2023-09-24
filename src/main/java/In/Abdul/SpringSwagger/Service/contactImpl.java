package In.Abdul.SpringSwagger.Service;

import In.Abdul.SpringSwagger.Entity.Contact;
import In.Abdul.SpringSwagger.Repository.contactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class contactImpl implements contactService{

    @Autowired
    private contactRepo repo;

    @Override
    public String addContact(Contact contact) {
       repo.save(contact);
       if (contact.getId()!=null){
           return "Contact Saved";
       }
       else {
           return "Contact Not Saved";
       }
    }

    @Override
    public List<Contact> getContactList() {
        return repo.findAll();
    }
}
