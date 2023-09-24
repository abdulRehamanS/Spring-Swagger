package In.Abdul.SpringSwagger.Service;

import In.Abdul.SpringSwagger.Entity.Contact;

import java.util.List;

public interface contactService {


    String addContact(Contact contact);

    List<Contact>getContactList();
}
