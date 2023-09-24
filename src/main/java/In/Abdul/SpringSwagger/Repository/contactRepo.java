package In.Abdul.SpringSwagger.Repository;

import In.Abdul.SpringSwagger.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactRepo extends JpaRepository<Contact, Integer> {
}
