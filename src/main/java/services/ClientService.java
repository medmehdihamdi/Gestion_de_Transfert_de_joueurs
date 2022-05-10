package services;
import java.util.List;
import java.util.Optional;

import model.Client;
public interface ClientService {
	public List<Client> getAllClients();
	public Optional<Client> getClient(Integer id);
	public void addClient(Client client);
}
