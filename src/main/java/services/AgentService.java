package services;
import java.util.List;
import java.util.Optional;

import model.Agent;
public interface AgentService {
	public List<Agent> getAllAgents();
	public Optional<Agent> getAgent(Integer id);
	public void addAgent(Agent agent);
}
